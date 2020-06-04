package asm.org.apache.openjpa.persistence.meta;
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
public class CompileTimeLoggerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/persistence/meta/CompileTimeLogger", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "org/apache/openjpa/persistence/meta/CompileTimeLogger", "Level", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("javax/tools/Diagnostic$Kind", "javax/tools/Diagnostic", "Kind", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "_loc", "Lorg/apache/openjpa/lib/util/Localizer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "DEFAULT_LEVEL", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "logLevel", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "messager", "Ljavax/annotation/processing/Messager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/annotation/processing/ProcessingEnvironment;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/annotation/processing/ProcessingEnvironment", "getMessager", "()Ljavax/annotation/processing/Messager;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "messager", "Ljavax/annotation/processing/Messager;");
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "DEFAULT_LEVEL", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ordinal", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "logLevel", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/openjpa/persistence/meta/CompileTimeLogger", "javax/annotation/processing/ProcessingEnvironment", "java/lang/String"}, 0, new Object[] {});
methodVisitor.visitLdcInsn("trace");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "TRACE", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ordinal", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "logLevel", "I");
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("info");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "INFO", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ordinal", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "logLevel", "I");
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("warn");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "WARN", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ordinal", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "logLevel", "I");
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("error");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ERROR", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ordinal", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "logLevel", "I");
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "DEFAULT_LEVEL", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ordinal", "()I", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "logLevel", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("mmg-bad-log");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "DEFAULT_LEVEL", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "warn", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "INFO", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/tools/Diagnostic$Kind", "NOTE", "Ljavax/tools/Diagnostic$Kind;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "log", "(Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;Lorg/apache/openjpa/lib/util/Localizer$Message;Ljavax/tools/Diagnostic$Kind;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "trace", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "TRACE", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/tools/Diagnostic$Kind", "NOTE", "Ljavax/tools/Diagnostic$Kind;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "log", "(Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;Lorg/apache/openjpa/lib/util/Localizer$Message;Ljavax/tools/Diagnostic$Kind;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "warn", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "WARN", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/tools/Diagnostic$Kind", "MANDATORY_WARNING", "Ljavax/tools/Diagnostic$Kind;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "log", "(Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;Lorg/apache/openjpa/lib/util/Localizer$Message;Ljavax/tools/Diagnostic$Kind;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "error", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "error", "(Lorg/apache/openjpa/lib/util/Localizer$Message;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "error", "(Lorg/apache/openjpa/lib/util/Localizer$Message;Ljava/lang/Throwable;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ERROR", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "javax/tools/Diagnostic$Kind", "ERROR", "Ljavax/tools/Diagnostic$Kind;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "log", "(Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;Lorg/apache/openjpa/lib/util/Localizer$Message;Ljavax/tools/Diagnostic$Kind;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "printStackTrace", "()V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "log", "(Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;Lorg/apache/openjpa/lib/util/Localizer$Message;Ljavax/tools/Diagnostic$Kind;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "logLevel", "I");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "ordinal", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGT, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "messager", "Ljavax/annotation/processing/Messager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer$Message", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/annotation/processing/Messager", "printMessage", "(Ljavax/tools/Diagnostic$Kind;Ljava/lang/CharSequence;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/meta/CompileTimeLogger;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/Localizer", "forPackage", "(Ljava/lang/Class;)Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger$Level", "WARN", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/CompileTimeLogger", "DEFAULT_LEVEL", "Lorg/apache/openjpa/persistence/meta/CompileTimeLogger$Level;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
