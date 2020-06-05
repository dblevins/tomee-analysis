package asm.org.apache.cxf.binding.soap;
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
public class HeaderUtilDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/apache/cxf/binding/soap/HeaderUtil", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "HEADERS_PROPERTY", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getHeaderParts", "(Lorg/apache/cxf/service/model/BindingMessageInfo;)Ljava/util/Set;", "(Lorg/apache/cxf/service/model/BindingMessageInfo;)Ljava/util/Set<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/HeaderUtil", "HEADERS_PROPERTY", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingMessageInfo", "getProperty", "(Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/HeaderUtil", "getHeaderQNames", "(Lorg/apache/cxf/service/model/BindingMessageInfo;)Ljava/util/Set;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/cxf/binding/soap/HeaderUtil", "HEADERS_PROPERTY", "Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingMessageInfo", "setProperty", "(Ljava/lang/String;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Set");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/helpers/CastUtils", "cast", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getHeaderQNames", "(Lorg/apache/cxf/service/model/BindingMessageInfo;)Ljava/util/Set;", "(Lorg/apache/cxf/service/model/BindingMessageInfo;)Ljava/util/Set<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingMessageInfo", "getMessageInfo", "()Lorg/apache/cxf/service/model/MessageInfo;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessageInfo", "getMessageParts", "()Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/wsdl/extensions/ExtensibilityElement;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingMessageInfo", "getExtensors", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/service/model/BindingMessageInfo", "java/util/Set", "java/util/List", "java/util/List", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/wsdl/extensions/ExtensibilityElement");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/SOAPBindingUtil", "isSOAPHeader", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/SOAPBindingUtil", "getSoapHeader", "(Ljava/lang/Object;)Lorg/apache/cxf/binding/soap/wsdl/extensions/SoapHeader;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/binding/soap/wsdl/extensions/SoapHeader", "getPart", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 8);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/apache/cxf/service/model/BindingMessageInfo", "java/util/Set", "java/util/List", "java/util/List", "java/util/Iterator", "javax/wsdl/extensions/ExtensibilityElement", "org/apache/cxf/binding/soap/wsdl/extensions/SoapHeader", "java/lang/String", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/cxf/service/model/MessagePartInfo");
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "isElement", "()Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getElementQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/service/model/MessagePartInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/MessagePartInfo", "getTypeQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/cxf/service/model/BindingMessageInfo", "java/util/Set", "java/util/List", "java/util/List", "java/util/Iterator"}, 0, new Object[] {});
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getHeaderQNameInOperationParam", "(Lorg/apache/cxf/binding/soap/SoapMessage;)Ljava/util/Set;", "(Lorg/apache/cxf/binding/soap/SoapMessage;)Ljava/util/Set<Ljavax/xml/namespace/QName;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/binding/soap/SoapMessage", "getExchange", "()Lorg/apache/cxf/message/Exchange;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/cxf/message/Exchange", "getBindingOperationInfo", "()Lorg/apache/cxf/service/model/BindingOperationInfo;", true);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getInput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getInput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/HeaderUtil", "getHeaderParts", "(Lorg/apache/cxf/service/model/BindingMessageInfo;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/cxf/service/model/BindingOperationInfo"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getOutput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/cxf/service/model/BindingOperationInfo", "getOutput", "()Lorg/apache/cxf/service/model/BindingMessageInfo;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/cxf/binding/soap/HeaderUtil", "getHeaderParts", "(Lorg/apache/cxf/service/model/BindingMessageInfo;)Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/cxf/binding/soap/HeaderUtil;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".HEADERS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/cxf/binding/soap/HeaderUtil", "HEADERS_PROPERTY", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
