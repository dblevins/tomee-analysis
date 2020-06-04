package asm.org.apache.openejb.client;
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
public class RequestTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openejb/client/RequestType", "Ljava/lang/Enum<Lorg/apache/openejb/client/RequestType;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NOP_REQUEST", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB_REQUEST", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JNDI_REQUEST", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "AUTH_REQUEST", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CLUSTER_REQUEST", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOGOUT_REQUEST", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOP_REQUEST_Quit", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOP_REQUEST_quit", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOP_REQUEST_Stop", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOP_REQUEST_stop", "Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "code", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "ENUM_MAP", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/Byte;Lorg/apache/openejb/client/RequestType;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openejb/client/RequestType;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openejb/client/RequestType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "$VALUES", "[Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openejb/client/RequestType;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openejb/client/RequestType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/client/RequestType;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IB)V", "(B)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/client/RequestType", "code", "B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCode", "()B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RequestType", "code", "B");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(B)Lorg/apache/openejb/client/RequestType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "ENUM_MAP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/client/RequestType");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "()V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openejb/client/RequestType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NOP_REQUEST");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "NOP_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB_REQUEST");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "EJB_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JNDI_REQUEST");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "JNDI_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("AUTH_REQUEST");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "AUTH_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CLUSTER_REQUEST");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "CLUSTER_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOGOUT_REQUEST");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "LOGOUT_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOP_REQUEST_Quit");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 81);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "STOP_REQUEST_Quit", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOP_REQUEST_quit");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 113);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "STOP_REQUEST_quit", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOP_REQUEST_Stop");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 83);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "STOP_REQUEST_Stop", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOP_REQUEST_stop");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 115);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/client/RequestType", "<init>", "(Ljava/lang/String;IB)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "STOP_REQUEST_stop", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/client/RequestType");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "NOP_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "EJB_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "JNDI_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "AUTH_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "CLUSTER_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "LOGOUT_REQUEST", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "STOP_REQUEST_Quit", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "STOP_REQUEST_quit", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "STOP_REQUEST_Stop", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "STOP_REQUEST_stop", "Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "$VALUES", "[Lorg/apache/openejb/client/RequestType;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/client/RequestType", "ENUM_MAP", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/client/RequestType", "values", "()[Lorg/apache/openejb/client/RequestType;", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"[Lorg/apache/openejb/client/RequestType;", Opcodes.INTEGER, Opcodes.INTEGER}, 0, null);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/client/RequestType", "ENUM_MAP", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/client/RequestType", "code", "B");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(2, 1);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,3, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
