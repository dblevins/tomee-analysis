package asm.org.apache.cxf.transport;
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
public class AbstractMultiplexDestinationDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/transport/AbstractMultiplexDestination", null, "org/apache/cxf/transport/AbstractDestination", new String[] { "org/apache/cxf/transport/MultiplexDestination" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MULTIPLEX_ID_QNAME", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/ws/addressing/EndpointReferenceType;Lorg/apache/cxf/service/model/EndpointInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/AbstractDestination", "<init>", "(Lorg/apache/cxf/Bus;Lorg/apache/cxf/ws/addressing/EndpointReferenceType;Lorg/apache/cxf/service/model/EndpointInfo;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAddressWithId", "(Ljava/lang/String;)Lorg/apache/cxf/ws/addressing/EndpointReferenceType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/AbstractMultiplexDestination", "reference", "Lorg/apache/cxf/ws/addressing/EndpointReferenceType;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/cxf/transport/AbstractMultiplexDestination", "bus", "Lorg/apache/cxf/Bus;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/addressing/EndpointReferenceUtils", "mint", "(Lorg/apache/cxf/ws/addressing/EndpointReferenceType;Lorg/apache/cxf/Bus;)Lorg/apache/cxf/ws/addressing/EndpointReferenceType;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/ws/addressing/EndpointReferenceUtils", "duplicate", "(Lorg/apache/cxf/ws/addressing/EndpointReferenceType;)Lorg/apache/cxf/ws/addressing/EndpointReferenceType;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/cxf/ws/addressing/ObjectFactory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/ws/addressing/ObjectFactory", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/ObjectFactory", "createReferenceParametersType", "()Lorg/apache/cxf/ws/addressing/ReferenceParametersType;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/EndpointReferenceType", "getReferenceParameters", "()Lorg/apache/cxf/ws/addressing/ReferenceParametersType;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/ReferenceParametersType", "getAny", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/ReferenceParametersType", "getAny", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "addAll", "(Ljava/util/Collection;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/cxf/ws/addressing/EndpointReferenceType", "org/apache/cxf/ws/addressing/ReferenceParametersType", "org/apache/cxf/ws/addressing/ReferenceParametersType"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/ReferenceParametersType", "getAny", "()Ljava/util/List;", false);
methodVisitor.visitTypeInsn(NEW, "jakarta/xml/bind/JAXBElement");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/AbstractMultiplexDestination", "MULTIPLEX_ID_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/xml/bind/JAXBElement", "<init>", "(Ljavax/xml/namespace/QName;Ljava/lang/Class;Ljava/lang/Object;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/EndpointReferenceType", "setReferenceParameters", "(Lorg/apache/cxf/ws/addressing/ReferenceParametersType;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "(Ljava/util/Map;)Ljava/lang/String;", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)Ljava/lang/String;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("jakarta.xml.ws.addressing.context.inbound");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/ws/addressing/AddressingProperties");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/AddressingProperties", "getToEndpointReference", "()Lorg/apache/cxf/ws/addressing/EndpointReferenceType;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/transport/AbstractMultiplexDestination", "MULTIPLEX_ID_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/transport/AbstractMultiplexDestination", "extractStringElementFromAny", "(Ljavax/xml/namespace/QName;Lorg/apache/cxf/ws/addressing/EndpointReferenceType;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "org/apache/cxf/ws/addressing/AddressingProperties"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "extractStringElementFromAny", "(Ljavax/xml/namespace/QName;Lorg/apache/cxf/ws/addressing/EndpointReferenceType;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/EndpointReferenceType", "getReferenceParameters", "()Lorg/apache/cxf/ws/addressing/ReferenceParametersType;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/EndpointReferenceType", "getReferenceParameters", "()Lorg/apache/cxf/ws/addressing/ReferenceParametersType;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/ws/addressing/ReferenceParametersType", "getAny", "()Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"java/lang/String", "java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(INSTANCEOF, "jakarta/xml/bind/JAXBElement");
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/xml/bind/JAXBElement");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/bind/JAXBElement", "getName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "jakarta/xml/bind/JAXBElement", "getValue", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://multiplex.transport.cxf.apache.org");
methodVisitor.visitLdcInsn("id");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/transport/AbstractMultiplexDestination", "MULTIPLEX_ID_QNAME", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
