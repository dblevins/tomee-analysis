package asm.com.sun.faces.application;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class ConverterPropertyEditorFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "com/sun/faces/application/ConverterPropertyEditorFactory", null, "java/lang/Object", null);

classWriter.visitInnerClass("com/sun/faces/application/ConverterPropertyEditorFactory$DisposableClassLoader", "com/sun/faces/application/ConverterPropertyEditorFactory", "DisposableClassLoader", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "com/sun/faces/application/ConverterPropertyEditorFactory", "ClassTemplateInfo", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("com/sun/faces/application/ConverterPropertyEditorFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "LOGGER", "Ljava/util/logging/Logger;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "UNDERSCORE_PATTERN", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "SingleUnderscorePattern", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MultipleUnderscorePattern", "Ljava/util/regex/Pattern;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "defaultInstance", "Lcom/sun/faces/application/ConverterPropertyEditorFactory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "templateInfo", "Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "classLoaderCache", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/ClassLoader;Ljava/lang/ref/WeakReference<Lcom/sun/faces/application/ConverterPropertyEditorFactory$DisposableClassLoader;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "PRIM_MAP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Character;Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory", "templateInfo", "Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Class;)V", "(Ljava/lang/Class<+Lcom/sun/faces/application/ConverterPropertyEditorBase;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "<init>", "(Ljava/lang/Class;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory", "templateInfo", "Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_SYNCHRONIZED, "getDefaultInstance", "()Lcom/sun/faces/application/ConverterPropertyEditorFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "defaultInstance", "Lcom/sun/faces/application/ConverterPropertyEditorFactory;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/ConverterPropertyEditorFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ConverterPropertyEditorFactory", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "defaultInstance", "Lcom/sun/faces/application/ConverterPropertyEditorFactory;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "defaultInstance", "Lcom/sun/faces/application/ConverterPropertyEditorFactory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "getTemplateInfo", "()Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory", "templateInfo", "Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "definePropertyEditorClassFor", "(Ljava/lang/Class;)Ljava/lang/Class;", "(Ljava/lang/Class<*>;)Ljava/lang/Class<+Lcom/sun/faces/application/ConverterPropertyEditorBase;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/ClassNotFoundException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/ClassNotFoundException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ConverterPropertyEditorFactory", "getTemplateInfo", "()Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo", "generateClassNameFor", "(Ljava/lang/Class;Z)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory", "classLoaderCache", "Ljava/util/Map;");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/WeakHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/WeakHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory", "classLoaderCache", "Ljava/util/Map;");
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory", "classLoaderCache", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/ref/WeakReference");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ref/WeakReference", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ConverterPropertyEditorFactory$DisposableClassLoader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label7);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {Opcodes.TOP, "java/lang/ref/WeakReference"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "com/sun/faces/application/ConverterPropertyEditorFactory$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ConverterPropertyEditorFactory$1", "<init>", "(Lcom/sun/faces/application/ConverterPropertyEditorFactory;Ljava/lang/Class;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/security/AccessController", "doPrivileged", "(Ljava/security/PrivilegedAction;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/faces/application/ConverterPropertyEditorFactory$DisposableClassLoader");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/faces/application/ConverterPropertyEditorFactory", "java/lang/Class", "java/lang/String", "com/sun/faces/application/ConverterPropertyEditorFactory$DisposableClassLoader", "java/lang/ref/WeakReference"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/faces/application/ConverterPropertyEditorFactory", "classLoaderCache", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitTypeInsn(NEW, "java/lang/ref/WeakReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/ref/WeakReference", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/application/ConverterPropertyEditorFactory$DisposableClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"com/sun/faces/application/ConverterPropertyEditorFactory", "java/lang/Class"}, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "isLoggable", "(Ljava/util/logging/Level;)Z", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "WARNING", "Ljava/util/logging/Level;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("definePropertyEditorClassFor: ClassNotFoundException: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassNotFoundException", "getMessage", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getVMClassName", "(Ljava/lang/Class;)Ljava/lang/String;", "(Ljava/lang/Class<*>;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(CC)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getUtf8InfoBytes", "(Ljava/lang/String;)[B", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/UnsupportedEncodingException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/UnsupportedEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(IADD);
methodVisitor.visitIntInsn(NEWARRAY, T_BYTE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitInsn(IAND);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Ljava/lang/String;)[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "getUtf8InfoBytes", "(Ljava/lang/String;)[B", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "(Ljava/lang/Class;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "getVMClassName", "(Ljava/lang/Class;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "()Ljava/util/logging/Logger;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$400", "()Ljava/util/regex/Pattern;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "UNDERSCORE_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$500", "()Ljava/util/regex/Pattern;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "SingleUnderscorePattern", "Ljava/util/regex/Pattern;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "()Ljava/util/regex/Pattern;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "MultipleUnderscorePattern", "Ljava/util/regex/Pattern;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lcom/sun/faces/application/ConverterPropertyEditorFactory;)Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/faces/application/ConverterPropertyEditorFactory", "getTemplateInfo", "()Lcom/sun/faces/application/ConverterPropertyEditorFactory$ClassTemplateInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/util/FacesLogger", "APPLICATION", "Lcom/sun/faces/util/FacesLogger;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/faces/util/FacesLogger", "getLogger", "()Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "LOGGER", "Ljava/util/logging/Logger;");
methodVisitor.visitLdcInsn("_+");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "UNDERSCORE_PATTERN", "Ljava/util/regex/Pattern;");
methodVisitor.visitLdcInsn("([^_])_([^_])");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "SingleUnderscorePattern", "Ljava/util/regex/Pattern;");
methodVisitor.visitLdcInsn("_(_+)");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/regex/Pattern", "compile", "(Ljava/lang/String;)Ljava/util/regex/Pattern;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "MultipleUnderscorePattern", "Ljava/util/regex/Pattern;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(FCONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(IF)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 66);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitLdcInsn("byte");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 67);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitLdcInsn("char");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitLdcInsn("short");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 73);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitLdcInsn("int");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 70);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitLdcInsn("float");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 74);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitLdcInsn("long");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 68);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitLdcInsn("double");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/faces/application/ConverterPropertyEditorFactory", "PRIM_MAP", "Ljava/util/Map;");
methodVisitor.visitIntInsn(BIPUSH, 90);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
methodVisitor.visitLdcInsn("boolean");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
