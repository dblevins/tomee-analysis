package asm.org.apache.cxf.transport.http;
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
public class URLConnectionHTTPConduit$URLConnectionWrappedOutputStream$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream$2", "Ljava/lang/Object;Ljava/security/PrivilegedExceptionAction<Ljava/lang/Integer;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

classWriter.visitOuterClass("org/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream", "getResponseCode", "()I");

classWriter.visitInnerClass("org/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream", "org/apache/cxf/transport/http/URLConnectionHTTPConduit", "URLConnectionWrappedOutputStream", 0);

classWriter.visitInnerClass("org/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lorg/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream$2", "this$1", "Lorg/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Integer;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream$2", "this$1", "Lorg/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream", "connection", "Ljava/net/HttpURLConnection;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/HttpURLConnection", "getResponseCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/URLConnectionHTTPConduit$URLConnectionWrappedOutputStream$2", "run", "()Ljava/lang/Integer;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
