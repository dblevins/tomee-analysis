package asm.org.apache.openejb.config.rules;
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
public class CheckClassLoading$JarUtilDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/openejb/config/rules/CheckClassLoading$JarUtil", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/config/rules/CheckClassLoading$JarUtil", "org/apache/openejb/config/rules/CheckClassLoading", "JarUtil", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLASS_EXT", "Ljava/lang/String;", null, ".class");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "listFiles", "(Ljava/io/File;[Ljava/lang/String;)Ljava/util/List;", "(Ljava/io/File;[Ljava/lang/String;)Ljava/util/List<Ljava/lang/String;>;", new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/Throwable");
Label label6 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label6, null);
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
methodVisitor.visitTryCatchBlock(label7, label8, label9, "java/lang/Throwable");
Label label10 = new Label();
methodVisitor.visitTryCatchBlock(label5, label10, label6, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "exists", "()Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "isFile", "()Z", false);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNE, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "getPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(" is not a file");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "java/util/jar/JarFile");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/jar/JarFile", "<init>", "(Ljava/io/File;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "entries", "()Ljava/util/Enumeration;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
Label label13 = new Label();
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"java/io/File", "[Ljava/lang/String;", "java/util/List", "java/util/jar/JarFile", "java/lang/Throwable", "java/util/Enumeration"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Enumeration", "hasMoreElements", "()Z", true);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label14);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Enumeration", "nextElement", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/jar/JarEntry");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarEntry", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 10);
Label label15 = new Label();
methodVisitor.visitLabel(label15);
methodVisitor.visitFrame(Opcodes.F_FULL, 11, new Object[] {"java/io/File", "[Ljava/lang/String;", "java/util/List", "java/util/jar/JarFile", "java/lang/Throwable", "java/util/Enumeration", "java/util/jar/JarEntry", "java/lang/String", "[Ljava/lang/String;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitVarInsn(ILOAD, 9);
Label label16 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label16);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 11);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "endsWith", "(Ljava/lang/String;)Z", false);
Label label17 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label17);
methodVisitor.visitLdcInsn(".class");
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label18 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label18);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("/");
methodVisitor.visitLdcInsn(".");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "replace", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label18);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label16);
methodVisitor.visitLabel(label17);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitIincInsn(10, 1);
methodVisitor.visitJumpInsn(GOTO, label15);
methodVisitor.visitLabel(label16);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"java/io/File", "[Ljava/lang/String;", "java/util/List", "java/util/jar/JarFile", "java/lang/Throwable", "java/util/Enumeration"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label19 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label19);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label20 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label20);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/io/File", "[Ljava/lang/String;", "java/util/List", "java/util/jar/JarFile", "java/lang/Throwable", "java/util/Enumeration", "java/util/List"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label19);
methodVisitor.visitLabel(label20);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "close", "()V", false);
methodVisitor.visitLabel(label19);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"java/io/File", "[Ljava/lang/String;", "java/util/List", "java/util/jar/JarFile", "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label21 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label21);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label22 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label22);
methodVisitor.visitLabel(label7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "close", "()V", false);
methodVisitor.visitLabel(label8);
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 13, new Object[] {"java/io/File", "[Ljava/lang/String;", "java/util/List", "java/util/jar/JarFile", "java/lang/Throwable", Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, Opcodes.TOP, "java/lang/Throwable"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 13);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 13);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Throwable", "addSuppressed", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitJumpInsn(GOTO, label21);
methodVisitor.visitLabel(label22);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/jar/JarFile", "close", "()V", false);
methodVisitor.visitLabel(label21);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(4, 14);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
