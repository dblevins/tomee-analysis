package asm.com.sun.xml.bind.v2.schemagen;
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
public class XmlSchemaGenerator$Namespace$3Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", null, "com/sun/xml/bind/v2/schemagen/Tree$Term", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "handleElementProp", "(Lcom/sun/xml/bind/v2/model/core/ElementPropertyInfo;)Lcom/sun/xml/bind/v2/schemagen/Tree;");

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator", "Namespace", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/Tree$Term", "com/sun/xml/bind/v2/schemagen/Tree", "Term", ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$ename", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$ep", "Lcom/sun/xml/bind/v2/model/core/ElementPropertyInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$choice", "Lcom/sun/xml/bind/v2/schemagen/Tree;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;Ljavax/xml/namespace/QName;Lcom/sun/xml/bind/v2/model/core/ElementPropertyInfo;Lcom/sun/xml/bind/v2/schemagen/Tree;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ename", "Ljavax/xml/namespace/QName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ep", "Lcom/sun/xml/bind/v2/model/core/ElementPropertyInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$choice", "Lcom/sun/xml/bind/v2/schemagen/Tree;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/schemagen/Tree$Term", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "write", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer;ZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer", "element", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ename", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ename", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "uri", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ename", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ename", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "ref", "(Ljavax/xml/namespace/QName;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ename", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "name", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$1900", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;)Lcom/sun/xml/bind/v2/schemagen/Form;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ename", "Ljavax/xml/namespace/QName;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/schemagen/Form", "writeForm", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ep", "Lcom/sun/xml/bind/v2/model/core/ElementPropertyInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/ElementPropertyInfo", "isCollectionNillable", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "nillable", "(Z)Lcom/sun/xml/bind/v2/schemagen/xmlschema/Element;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$ep", "Lcom/sun/xml/bind/v2/model/core/ElementPropertyInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/ElementPropertyInfo", "isCollectionRequired", "()Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitInsn(ICONST_1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "com/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer", Opcodes.INTEGER, Opcodes.INTEGER, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement"}, 2, new Object[] {"com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "com/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer", Opcodes.INTEGER, Opcodes.INTEGER, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement"}, 3, new Object[] {"com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", Opcodes.INTEGER});
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "writeOccurs", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/Occurs;ZZ)V", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "complexType", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/ComplexType;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$3", "val$choice", "Lcom/sun/xml/bind/v2/schemagen/Tree;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/schemagen/Tree", "write", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/TypeDefParticle;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
