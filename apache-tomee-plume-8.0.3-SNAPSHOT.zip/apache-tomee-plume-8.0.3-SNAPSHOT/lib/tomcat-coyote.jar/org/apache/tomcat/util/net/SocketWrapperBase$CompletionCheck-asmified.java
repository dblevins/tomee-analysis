package asm.org.apache.tomcat.util.net;
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
public class SocketWrapperBase$CompletionCheckDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$CompletionState", "org/apache/tomcat/util/net/SocketWrapperBase", "CompletionState", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$CompletionHandlerCall", "org/apache/tomcat/util/net/SocketWrapperBase", "CompletionHandlerCall", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/apache/tomcat/util/net/SocketWrapperBase$CompletionCheck", "org/apache/tomcat/util/net/SocketWrapperBase", "CompletionCheck", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "callHandler", "(Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionState;[Ljava/nio/ByteBuffer;II)Lorg/apache/tomcat/util/net/SocketWrapperBase$CompletionHandlerCall;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
