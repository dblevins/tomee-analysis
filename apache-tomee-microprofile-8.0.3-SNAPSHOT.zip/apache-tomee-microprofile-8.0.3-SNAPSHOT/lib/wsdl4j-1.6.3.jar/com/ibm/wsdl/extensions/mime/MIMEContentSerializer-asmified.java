package asm.com.ibm.wsdl.extensions.mime;
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
public class MIMEContentSerializerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "com/ibm/wsdl/extensions/mime/MIMEContentSerializer", null, "java/lang/Object", new String[] { "javax/wsdl/extensions/ExtensionSerializer", "javax/wsdl/extensions/ExtensionDeserializer", "java/io/Serializable" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "marshall", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;Ljavax/wsdl/extensions/ExtensibilityElement;Ljava/io/PrintWriter;Ljavax/wsdl/Definition;Ljavax/wsdl/extensions/ExtensionRegistry;)V", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/wsdl/extensions/mime/MIMEContent");
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/wsdl/mime/");
methodVisitor.visitLdcInsn("content");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getQualifiedValue", "(Ljava/lang/String;Ljava/lang/String;Ljavax/wsdl/Definition;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/wsdl/extensions/mime/MIMEPart;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "isAssignableFrom", "(Ljava/lang/Class;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("    ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("        <");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintWriter", "print", "(Ljava/lang/String;)V", false);
methodVisitor.visitLdcInsn("part");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/mime/MIMEContent", "getPart", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "printAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/PrintWriter;)V", false);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/mime/MIMEContent", "getType", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "printAttribute", "(Ljava/lang/String;Ljava/lang/String;Ljava/io/PrintWriter;)V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/mime/MIMEContent", "getRequired", "()Ljava/lang/Boolean;", true);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/Constants", "Q_ATTR_REQUIRED", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "printQualifiedAttribute", "(Ljavax/xml/namespace/QName;Ljava/lang/String;Ljavax/wsdl/Definition;Ljava/io/PrintWriter;)V", false);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("/>");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintWriter", "println", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unmarshall", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;Lorg/w3c/dom/Element;Ljavax/wsdl/Definition;Ljavax/wsdl/extensions/ExtensionRegistry;)Ljavax/wsdl/extensions/ExtensibilityElement;", null, new String[] { "javax/wsdl/WSDLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/wsdl/extensions/ExtensionRegistry", "createExtension", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;)Ljavax/wsdl/extensions/ExtensibilityElement;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/wsdl/extensions/mime/MIMEContent");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("part");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttribute", "(Lorg/w3c/dom/Element;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitLdcInsn("http://schemas.xmlsoap.org/wsdl/");
methodVisitor.visitLdcInsn("required");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/ibm/wsdl/util/xml/DOMUtils", "getAttributeNS", "(Lorg/w3c/dom/Element;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 7);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/mime/MIMEContent", "setPart", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 8);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/mime/MIMEContent", "setType", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 9);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitTypeInsn(NEW, "java/lang/Boolean");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Boolean", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/wsdl/extensions/mime/MIMEContent", "setRequired", "(Ljava/lang/Boolean;)V", true);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 10);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
