package asm.org.apache.cxf.transport.http.policy;
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
public class HTTPServerAssertionBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/http/policy/HTTPServerAssertionBuilder", "Lorg/apache/cxf/ws/policy/builder/jaxb/JaxbAssertionBuilder<Lorg/apache/cxf/transports/http/configuration/HTTPServerPolicy;>;", "org/apache/cxf/ws/policy/builder/jaxb/JaxbAssertionBuilder", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/cxf/common/injection/NoJSR250Annotations;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/cxf/transport/http/policy/HTTPServerAssertionBuilder$HTTPServerPolicyAssertion", "org/apache/cxf/transport/http/policy/HTTPServerAssertionBuilder", "HTTPServerPolicyAssertion", 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "KNOWN_ELEMENTS", "Ljava/util/List;", "Ljava/util/List<Ljavax/xml/namespace/QName;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, new String[] { "jakarta/xml/bind/JAXBException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/transports/http/configuration/HTTPServerPolicy;"));
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/policy/impl/ServerPolicyCalculator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/policy/impl/ServerPolicyCalculator", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/policy/impl/ServerPolicyCalculator", "getDataClassName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/policy/builder/jaxb/JaxbAssertionBuilder", "<init>", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "buildAssertion", "()Lorg/apache/cxf/ws/policy/builder/jaxb/JaxbAssertion;", "()Lorg/apache/cxf/ws/policy/builder/jaxb/JaxbAssertion<Lorg/apache/cxf/transports/http/configuration/HTTPServerPolicy;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/policy/HTTPServerAssertionBuilder$HTTPServerPolicyAssertion");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/policy/HTTPServerAssertionBuilder$HTTPServerPolicyAssertion", "<init>", "(Lorg/apache/cxf/transport/http/policy/HTTPServerAssertionBuilder;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/policy/impl/ServerPolicyCalculator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/policy/impl/ServerPolicyCalculator", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/transport/http/policy/impl/ServerPolicyCalculator", "getDataClassName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "singletonList", "(Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/transport/http/policy/HTTPServerAssertionBuilder", "KNOWN_ELEMENTS", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
