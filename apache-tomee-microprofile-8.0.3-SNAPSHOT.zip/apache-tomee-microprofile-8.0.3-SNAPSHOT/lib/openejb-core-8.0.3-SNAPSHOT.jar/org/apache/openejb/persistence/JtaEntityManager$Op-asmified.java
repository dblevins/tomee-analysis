package asm.org.apache.openejb.persistence;
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
public class JtaEntityManager$OpDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/persistence/JtaEntityManager$Op", "Ljava/lang/Enum<Lorg/apache/openejb/persistence/JtaEntityManager$Op;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaEntityManager$Op", "org/apache/openejb/persistence/JtaEntityManager", "Op", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaEntityManager$Op$1", null, null, ACC_STATIC);

classWriter.visitInnerClass("org/apache/openejb/persistence/JtaEntityManager$Timer", "org/apache/openejb/persistence/JtaEntityManager", "Timer", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "clear", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "close", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "contains", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "createNamedQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "createNativeQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "createQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "find", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "flush", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getFlushMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getReference", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "lock", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "merge", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "refresh", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "remove", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "setFlushMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "persist", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "detach", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getLockMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "unwrap", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "setProperty", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getCriteriaBuilder", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getProperties", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getMetamodel", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "joinTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getDelegate", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "createNamedStoredProcedureQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "createStoredProcedureQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "createEntityGraph", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getEntityGraph", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "getEntityGraphs", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "isJoinedToTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NOOP", "Lorg/apache/openejb/persistence/JtaEntityManager$Timer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "$VALUES", "[Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/persistence/JtaEntityManager$Op;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/persistence/JtaEntityManager$Op;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/persistence/JtaEntityManager$Op;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/persistence/JtaEntityManager$Op");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "(ZLorg/apache/openejb/persistence/JtaEntityManager;)Lorg/apache/openejb/persistence/JtaEntityManager$Timer;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Timer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Timer", "<init>", "(Lorg/apache/openejb/persistence/JtaEntityManager$Op;Lorg/apache/openejb/persistence/JtaEntityManager;)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "NOOP", "Lorg/apache/openejb/persistence/JtaEntityManager$Timer;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openejb/persistence/JtaEntityManager$Timer"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("clear");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "clear", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("close");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "close", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("contains");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "contains", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("createNamedQuery");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createNamedQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("createNativeQuery");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createNativeQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("createQuery");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("find");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "find", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("flush");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "flush", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getFlushMode");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getFlushMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getReference");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getReference", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getTransaction");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("lock");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "lock", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("merge");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "merge", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("refresh");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "refresh", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("remove");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "remove", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("setFlushMode");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "setFlushMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("persist");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "persist", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("detach");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "detach", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getLockMode");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getLockMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("unwrap");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "unwrap", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("setProperty");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "setProperty", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getCriteriaBuilder");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getCriteriaBuilder", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getProperties");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getProperties", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getMetamodel");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getMetamodel", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("joinTransaction");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "joinTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getDelegate");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getDelegate", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("createNamedStoredProcedureQuery");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createNamedStoredProcedureQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("createStoredProcedureQuery");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createStoredProcedureQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("createEntityGraph");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createEntityGraph", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getEntityGraph");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getEntityGraph", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("getEntityGraphs");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getEntityGraphs", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("isJoinedToTransaction");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "isJoinedToTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/persistence/JtaEntityManager$Op");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "clear", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "close", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "contains", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createNamedQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createNativeQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "find", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "flush", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getFlushMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getReference", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "lock", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "merge", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "refresh", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "remove", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "setFlushMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "persist", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "detach", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getLockMode", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "unwrap", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "setProperty", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getCriteriaBuilder", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getProperties", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getMetamodel", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "joinTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getDelegate", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createNamedStoredProcedureQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createStoredProcedureQuery", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "createEntityGraph", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getEntityGraph", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "getEntityGraphs", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "isJoinedToTransaction", "Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "$VALUES", "[Lorg/apache/openejb/persistence/JtaEntityManager$Op;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/persistence/JtaEntityManager$Op$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/persistence/JtaEntityManager$Op$1", "<init>", "(Lorg/apache/openejb/persistence/JtaEntityManager$Op;Lorg/apache/openejb/persistence/JtaEntityManager;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/persistence/JtaEntityManager$Op", "NOOP", "Lorg/apache/openejb/persistence/JtaEntityManager$Timer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
