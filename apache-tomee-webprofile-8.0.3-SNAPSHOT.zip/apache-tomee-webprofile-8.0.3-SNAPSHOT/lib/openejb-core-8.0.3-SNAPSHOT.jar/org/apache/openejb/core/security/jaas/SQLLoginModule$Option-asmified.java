package asm.org.apache.openejb.core.security.jaas;
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
public class SQLLoginModule$OptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "Ljava/lang/Enum<Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "org/apache/openejb/core/security/jaas/SQLLoginModule", "Option", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USER_SELECT", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GROUP_SELECT", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONNECTION_URL", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "USER", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PASSWORD", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DRIVER", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATABASE_POOL_NAME", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DIGEST", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENCODING", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "$VALUES", "[Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "findByName", "(Ljava/lang/String;)Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "values", "()[Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "name", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USER_SELECT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("userSelect");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "USER_SELECT", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GROUP_SELECT");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("groupSelect");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "GROUP_SELECT", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONNECTION_URL");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("jdbcURL");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "CONNECTION_URL", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("USER");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("jdbcUser");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "USER", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PASSWORD");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("jdbcPassword");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "PASSWORD", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DRIVER");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("jdbcDriver");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "DRIVER", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATABASE_POOL_NAME");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("dataSourceName");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "DATABASE_POOL_NAME", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DIGEST");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("digest");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "DIGEST", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENCODING");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("encoding");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "ENCODING", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "USER_SELECT", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "GROUP_SELECT", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "CONNECTION_URL", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "USER", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "PASSWORD", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "DRIVER", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "DATABASE_POOL_NAME", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "DIGEST", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "ENCODING", "Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/core/security/jaas/SQLLoginModule$Option", "$VALUES", "[Lorg/apache/openejb/core/security/jaas/SQLLoginModule$Option;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
