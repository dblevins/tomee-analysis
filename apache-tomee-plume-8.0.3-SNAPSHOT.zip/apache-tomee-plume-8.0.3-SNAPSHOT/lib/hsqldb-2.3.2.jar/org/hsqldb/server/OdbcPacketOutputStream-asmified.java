package asm.org.hsqldb.server;
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
public class OdbcPacketOutputStreamDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/hsqldb/server/OdbcPacketOutputStream", null, "org/hsqldb/lib/DataOutputStream", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "byteArrayOutputStream", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "stringWriterOS", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "stringWriterDos", "Lorg/hsqldb/lib/DataOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "packetStart", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/lib/DataOutputStream", "count", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "packetStart", "I");
methodVisitor.visitInsn(ISUB);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNCHRONIZED, "write", "(Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "write", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNCHRONIZED, "write", "(Ljava/lang/String;Z)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterDos", "Lorg/hsqldb/lib/DataOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/DataOutputStream", "writeUTF", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterOS", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterOS", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "size", "()I", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "write", "([BII)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterOS", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "reset", "()V", false);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "writeByte", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNCHRONIZED, "writeSized", "(Ljava/lang/String;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterDos", "Lorg/hsqldb/lib/DataOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/DataOutputStream", "writeUTF", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterOS", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterOS", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "writeInt", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ISUB);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "write", "([BII)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNCHRONIZED, "reset", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "byteArrayOutputStream", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "count", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "packetStart", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "writeInt", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "newOdbcPacketOutputStream", "()Lorg/hsqldb/server/OdbcPacketOutputStream;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/server/OdbcPacketOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HsqlByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/server/OdbcPacketOutputStream", "<init>", "(Lorg/hsqldb/lib/HsqlByteArrayOutputStream;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/hsqldb/lib/HsqlByteArrayOutputStream;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/DataOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/HsqlByteArrayOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterOS", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/hsqldb/lib/DataOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterOS", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/DataOutputStream", "<init>", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterDos", "Lorg/hsqldb/lib/DataOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "packetStart", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "byteArrayOutputStream", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "reset", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNCHRONIZED, "xmit", "(CLorg/hsqldb/lib/DataOutputStream;)I", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "byteArrayOutputStream", "Lorg/hsqldb/lib/HsqlByteArrayOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/HsqlByteArrayOutputStream", "toByteArray", "()[B", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ISHR);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(I2B);
methodVisitor.visitInsn(BASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "reset", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/DataOutputStream", "writeByte", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/DataOutputStream", "write", "([B)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/DataOutputStream", "flush", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "close", "()V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/hsqldb/lib/DataOutputStream", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/hsqldb/server/OdbcPacketOutputStream", "stringWriterDos", "Lorg/hsqldb/lib/DataOutputStream;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/lib/DataOutputStream", "close", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_SYNCHRONIZED, "writeByteChar", "(C)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/hsqldb/server/OdbcPacketOutputStream", "writeByte", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
