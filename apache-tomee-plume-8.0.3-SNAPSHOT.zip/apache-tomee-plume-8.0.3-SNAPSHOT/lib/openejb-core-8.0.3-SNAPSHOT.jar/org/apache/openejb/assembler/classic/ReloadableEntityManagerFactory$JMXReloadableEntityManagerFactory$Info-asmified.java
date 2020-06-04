package asm.org.apache.openejb.assembler.classic;
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
public class ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$InfoDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "Ljava/lang/Enum<Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory", "JMXReloadableEntityManagerFactory", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory", "Info", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "URL", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NONE", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FILE", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLASS", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "$VALUES", "[Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "info", "(Ljava/lang/ClassLoader;Ljava/lang/Object;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label5, "java/lang/ClassNotFoundException");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$1", "$SwitchMap$org$apache$openejb$assembler$classic$ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "[I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "ordinal", "()I", false);
methodVisitor.visitInsn(IALOAD);
Label label6 = new Label();
Label label7 = new Label();
methodVisitor.visitTableSwitchInsn(1, 3, label7, new Label[] { label0, label6, label3 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/net/URL");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "openConnection", "()Ljava/net/URLConnection;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URLConnection", "getContentLength", "()I", false);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFLE, label8);
methodVisitor.visitLdcInsn("valid");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("not valid");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/lang/String");
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitTypeInsn(NEW, "java/io/File");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/File", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label11 = new Label();
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "java/io/File");
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label12);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/io/File");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitJumpInsn(GOTO, label11);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("unknown");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/io/File"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("exist? ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/File", "exists", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Z)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLdcInsn("loaded");
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/ClassNotFoundException"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn("unloadable");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("-");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("URL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "URL", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NONE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "NONE", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FILE");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "FILE", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLASS");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "CLASS", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "URL", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "NONE", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "FILE", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "CLASS", "Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info", "$VALUES", "[Lorg/apache/openejb/assembler/classic/ReloadableEntityManagerFactory$JMXReloadableEntityManagerFactory$Info;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
