package asm.org.apache.commons.jcs.utils.threadpool;
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
public class PoolConfiguration$WhenBlockedPolicyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "Ljava/lang/Enum<Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "org/apache/commons/jcs/utils/threadpool/PoolConfiguration", "WhenBlockedPolicy", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ABORT", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BLOCK", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "RUN", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WAIT", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DISCARDOLDEST", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "$VALUES", "[Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy");
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ABORT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "ABORT", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BLOCK");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "BLOCK", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("RUN");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "RUN", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WAIT");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "WAIT", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitTypeInsn(NEW, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DISCARDOLDEST");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "DISCARDOLDEST", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "ABORT", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "BLOCK", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "RUN", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "WAIT", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "DISCARDOLDEST", "Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy", "$VALUES", "[Lorg/apache/commons/jcs/utils/threadpool/PoolConfiguration$WhenBlockedPolicy;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}