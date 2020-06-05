package asm.org.apache.cxf.wsdl.binding;
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
public class AbstractWSDLBindingFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", null, "org/apache/cxf/binding/AbstractBindingFactory", new String[] { "org/apache/cxf/wsdl/binding/WSDLBindingFactory" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/AbstractBindingFactory", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/Collection;)V", "(Ljava/util/Collection<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/AbstractBindingFactory", "<init>", "(Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/Bus;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/AbstractBindingFactory", "<init>", "(Lorg/apache/cxf/Bus;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/cxf/Bus;Ljava/util/Collection;)V", "(Lorg/apache/cxf/Bus;Ljava/util/Collection<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/binding/AbstractBindingFactory", "<init>", "(Lorg/apache/cxf/Bus;Ljava/util/Collection;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createBindingInfo", "(Lorg/apache/cxf/service/model/ServiceInfo;Ljavax/wsdl/Binding;Ljava/lang/String;)Lorg/apache/cxf/service/model/BindingInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "createBindingInfo", "(Lorg/apache/cxf/service/model/ServiceInfo;Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/cxf/service/model/BindingInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "initializeBindingInfo", "(Lorg/apache/cxf/service/model/ServiceInfo;Ljavax/wsdl/Binding;Lorg/apache/cxf/service/model/BindingInfo;)Lorg/apache/cxf/service/model/BindingInfo;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "initializeBindingInfo", "(Lorg/apache/cxf/service/model/ServiceInfo;Ljavax/wsdl/Binding;Lorg/apache/cxf/service/model/BindingInfo;)Lorg/apache/cxf/service/model/BindingInfo;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/Binding", "getQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingInfo", "setName", "(Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "copyExtensors", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Ljavax/wsdl/extensions/ElementExtensible;Lorg/apache/cxf/service/model/BindingOperationInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/Binding", "getBindingOperations", "()Ljava/util/List;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/wsdl/BindingOperation;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/CastUtils", "cast", "(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/wsdl/BindingOperation");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingInput", "()Ljavax/wsdl/BindingInput;", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingInput", "()Ljavax/wsdl/BindingInput;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingInput", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"javax/wsdl/BindingOperation", "java/lang/String", "java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingOutput", "()Ljavax/wsdl/BindingOutput;", true);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingOutput", "()Ljavax/wsdl/BindingOutput;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOutput", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/Binding", "getPortType", "()Ljavax/wsdl/PortType;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/PortType", "getQName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingInfo", "getOperation", "(Ljavax/xml/namespace/QName;)Lorg/apache/cxf/service/model/BindingOperationInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingInfo", "buildOperation", "(Ljavax/xml/namespace/QName;Ljava/lang/String;Ljava/lang/String;)Lorg/apache/cxf/service/model/BindingOperationInfo;", false);
methodVisitor.visitVarInsn(ASTORE, 10);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitJumpInsn(IFNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingInfo", "addOperation", "(Lorg/apache/cxf/service/model/BindingOperationInfo;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"java/lang/String", "javax/xml/namespace/QName", "org/apache/cxf/service/model/BindingOperationInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 10);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "copyExtensors", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Ljavax/wsdl/extensions/ElementExtensible;Lorg/apache/cxf/service/model/BindingOperationInfo;)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingInput", "()Ljavax/wsdl/BindingInput;", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getInput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingInput", "()Ljavax/wsdl/BindingInput;", true);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "copyExtensors", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Ljavax/wsdl/extensions/ElementExtensible;Lorg/apache/cxf/service/model/BindingOperationInfo;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingOutput", "()Ljavax/wsdl/BindingOutput;", true);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getOutput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingOutput", "()Ljavax/wsdl/BindingOutput;", true);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "copyExtensors", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Ljavax/wsdl/extensions/ElementExtensible;Lorg/apache/cxf/service/model/BindingOperationInfo;)V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingFaults", "()Ljava/util/Map;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "values", "()Ljava/util/Collection;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/wsdl/BindingFault;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/CastUtils", "cast", "(Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 11);
Label label8 = new Label();
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 11);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/wsdl/BindingFault");
methodVisitor.visitVarInsn(ASTORE, 12);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingFault", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/common/util/StringUtils", "isEmpty", "(Ljava/lang/String;)Z", false);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label9);
methodVisitor.visitTypeInsn(NEW, "java/lang/IllegalArgumentException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("wsdl:fault and soap:fault elements must have a name attribute.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/IllegalArgumentException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/wsdl/BindingFault"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/ServiceInfo", "getTargetNamespace", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingFault", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getFault", "(Ljavax/xml/namespace/QName;)Lorg/apache/cxf/service/model/BindingFaultInfo;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 12);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingFault", "getName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/BindingOperation", "getBindingFault", "(Ljava/lang/String;)Ljavax/wsdl/BindingFault;", true);
methodVisitor.visitVarInsn(ALOAD, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "copyExtensors", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Ljavax/wsdl/extensions/ElementExtensible;Lorg/apache/cxf/service/model/BindingOperationInfo;)V", false);
methodVisitor.visitJumpInsn(GOTO, label8);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "org/apache/cxf/service/model/ServiceInfo", "javax/wsdl/Binding", "org/apache/cxf/service/model/BindingInfo", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 13);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "copyExtensors", "(Lorg/apache/cxf/service/model/AbstractPropertiesHolder;Ljavax/wsdl/extensions/ElementExtensible;Lorg/apache/cxf/service/model/BindingOperationInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/ElementExtensible", "getExtensibilityElements", "()Ljava/util/List;", true);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/wsdl/extensions/ExtensibilityElement;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/CastUtils", "cast", "(Ljava/util/List;Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/wsdl/extensions/ExtensibilityElement");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/AbstractPropertiesHolder", "addExtensor", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/wsdl/BindingInput");
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "addMessageFromBinding", "(Ljavax/wsdl/extensions/ExtensibilityElement;Lorg/apache/cxf/service/model/BindingOperationInfo;Z)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"javax/wsdl/extensions/ExtensibilityElement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/wsdl/BindingOutput");
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/wsdl/binding/AbstractWSDLBindingFactory", "addMessageFromBinding", "(Ljavax/wsdl/extensions/ExtensibilityElement;Lorg/apache/cxf/service/model/BindingOperationInfo;Z)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "addMessageFromBinding", "(Ljavax/wsdl/extensions/ExtensibilityElement;Lorg/apache/cxf/service/model/BindingOperationInfo;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}