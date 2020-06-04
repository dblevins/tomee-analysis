package asm.org.apache.activemq.protobuf;
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
public class InvalidProtocolBufferExceptionDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/activemq/protobuf/InvalidProtocolBufferException", null, "java/io/IOException", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(5685337441004132240L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/IOException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "truncatedMessage", "()Lorg/apache/activemq/protobuf/InvalidProtocolBufferException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/InvalidProtocolBufferException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/InvalidProtocolBufferException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "negativeSize", "()Lorg/apache/activemq/protobuf/InvalidProtocolBufferException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/InvalidProtocolBufferException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/InvalidProtocolBufferException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "malformedVarint", "()Lorg/apache/activemq/protobuf/InvalidProtocolBufferException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/InvalidProtocolBufferException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CodedInputStream encountered a malformed varint.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/InvalidProtocolBufferException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "invalidTag", "()Lorg/apache/activemq/protobuf/InvalidProtocolBufferException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/InvalidProtocolBufferException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Protocol message contained an invalid tag (zero).");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/InvalidProtocolBufferException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "invalidEndTag", "()Lorg/apache/activemq/protobuf/InvalidProtocolBufferException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/InvalidProtocolBufferException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Protocol message end-group tag did not match expected tag.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/InvalidProtocolBufferException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "invalidWireType", "()Lorg/apache/activemq/protobuf/InvalidProtocolBufferException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/InvalidProtocolBufferException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Protocol message tag had invalid wire type.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/InvalidProtocolBufferException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "recursionLimitExceeded", "()Lorg/apache/activemq/protobuf/InvalidProtocolBufferException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/InvalidProtocolBufferException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/InvalidProtocolBufferException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "sizeLimitExceeded", "()Lorg/apache/activemq/protobuf/InvalidProtocolBufferException;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/activemq/protobuf/InvalidProtocolBufferException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/activemq/protobuf/InvalidProtocolBufferException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
