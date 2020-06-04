package asm.org.apache.cxf.rs.security.jose.jaxrs.multipart;
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
public class JwsMultipartSignatureOutFilter$JwsSignatureDataHandlerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter$JwsSignatureDataHandler", null, "javax/activation/DataHandler", null);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter$JwsSignatureDataHandler", "org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter", "JwsSignatureDataHandler", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/cxf/rs/security/jose/jws/JwsException$Error", "org/apache/cxf/rs/security/jose/jws/JwsException", "Error", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "handler", "Ljavax/activation/DataHandler;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter;Ljavax/activation/DataHandler;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter$JwsSignatureDataHandler", "this$0", "Lorg/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/attachment/ByteDataSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "getBytes", "()[B", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/attachment/ByteDataSource", "<init>", "([B)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/activation/DataHandler", "<init>", "(Ljavax/activation/DataSource;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter$JwsSignatureDataHandler", "handler", "Ljavax/activation/DataHandler;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getContentType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter$JwsSignatureDataHandler", "handler", "Ljavax/activation/DataHandler;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/activation/DataHandler", "getContentType", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeTo", "(Ljava/io/OutputStream;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsOutputStream");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter$JwsSignatureDataHandler", "this$0", "Lorg/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter", "access$000", "(Lorg/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter;)Lorg/apache/cxf/rs/security/jose/jws/JwsSignature;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsOutputStream", "<init>", "(Ljava/io/OutputStream;Lorg/apache/cxf/rs/security/jose/jws/JwsSignature;Z)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter$JwsSignatureDataHandler", "handler", "Ljavax/activation/DataHandler;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/activation/DataHandler", "writeTo", "(Ljava/io/OutputStream;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/rs/security/jose/jws/JwsOutputStream", "flush", "()V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/cxf/rs/security/jose/jaxrs/multipart/JwsMultipartSignatureOutFilter$JwsSignatureDataHandler", "java/io/OutputStream", "org/apache/cxf/rs/security/jose/jws/JwsOutputStream"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/rs/security/jose/jws/JwsException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/rs/security/jose/jws/JwsException$Error", "INVALID_SIGNATURE", "Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/rs/security/jose/jws/JwsException", "<init>", "(Lorg/apache/cxf/rs/security/jose/jws/JwsException$Error;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
