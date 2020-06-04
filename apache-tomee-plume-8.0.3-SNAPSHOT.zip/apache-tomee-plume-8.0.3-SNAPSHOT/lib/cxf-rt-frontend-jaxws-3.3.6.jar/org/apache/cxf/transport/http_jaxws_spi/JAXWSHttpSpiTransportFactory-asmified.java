package asm.org.apache.cxf.transport.http_jaxws_spi;
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
public class JAXWSHttpSpiTransportFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactory", null, "org/apache/cxf/binding/soap/SoapTransportFactory", new String[] { "org/apache/cxf/transport/DestinationFactory" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "context", "Ljakarta/xml/ws/spi/http/HttpContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "destination", "Lorg/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiDestination;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/xml/ws/spi/http/HttpContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/soap/SoapTransportFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactory", "context", "Ljakarta/xml/ws/spi/http/HttpContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDestination", "(Lorg/apache/cxf/service/model/EndpointInfo;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/transport/Destination;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactory", "destination", "Lorg/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiDestination;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiDestination");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http/DestinationRegistryImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http/DestinationRegistryImpl", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiDestination", "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/transport/http/DestinationRegistry;Lorg/apache/cxf/service/model/EndpointInfo;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactory", "destination", "Lorg/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiDestination;");
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/transport/http_jaxws_spi/HttpHandlerImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactory", "destination", "Lorg/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiDestination;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/http_jaxws_spi/HttpHandlerImpl", "<init>", "(Lorg/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiDestination;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactory", "context", "Ljakarta/xml/ws/spi/http/HttpContext;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/ws/spi/http/HttpContext", "setHandler", "(Ljakarta/xml/ws/spi/http/HttpHandler;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiTransportFactory", "destination", "Lorg/apache/cxf/transport/http_jaxws_spi/JAXWSHttpSpiDestination;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
