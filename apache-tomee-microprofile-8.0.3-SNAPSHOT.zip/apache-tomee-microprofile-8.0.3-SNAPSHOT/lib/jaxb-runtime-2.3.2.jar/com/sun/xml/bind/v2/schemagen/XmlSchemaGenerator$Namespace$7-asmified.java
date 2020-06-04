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
public class XmlSchemaGenerator$Namespace$7Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", null, "com/sun/xml/bind/v2/schemagen/Tree$Term", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "handleMapProp", "(Lcom/sun/xml/bind/v2/model/core/MapPropertyInfo;)Lcom/sun/xml/bind/v2/schemagen/Tree;");

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator", "Namespace", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/Tree$Term", "com/sun/xml/bind/v2/schemagen/Tree", "Term", ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$mp", "Lcom/sun/xml/bind/v2/model/core/MapPropertyInfo;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;Lcom/sun/xml/bind/v2/model/core/MapPropertyInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "val$mp", "Lcom/sun/xml/bind/v2/model/core/MapPropertyInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/schemagen/Tree$Term", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "write", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer;ZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "val$mp", "Lcom/sun/xml/bind/v2/model/core/MapPropertyInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/MapPropertyInfo", "getXmlName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer", "element", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$1900", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;)Lcom/sun/xml/bind/v2/schemagen/Form;", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/schemagen/Form", "writeForm", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "val$mp", "Lcom/sun/xml/bind/v2/model/core/MapPropertyInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/MapPropertyInfo", "isCollectionNillable", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "nillable", "(Z)Lcom/sun/xml/bind/v2/schemagen/xmlschema/Element;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"javax/xml/namespace/QName", "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "name", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "writeOccurs", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/Occurs;ZZ)V", false);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "complexType", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/ComplexType;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/ComplexType", "sequence", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/ExplicitGroup;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/ExplicitGroup", "element", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitLdcInsn("entry");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "name", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "minOccurs", "(I)Lcom/sun/xml/bind/v2/schemagen/xmlschema/Occurs;", true);
methodVisitor.visitLdcInsn("unbounded");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/Occurs", "maxOccurs", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/Occurs;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "complexType", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/ComplexType;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/ComplexType", "sequence", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/ExplicitGroup;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("key");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "val$mp", "Lcom/sun/xml/bind/v2/model/core/MapPropertyInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/MapPropertyInfo", "getKeyType", "()Lcom/sun/xml/bind/v2/model/core/NonElement;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$2300", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;Lcom/sun/xml/bind/v2/schemagen/xmlschema/ExplicitGroup;Ljava/lang/String;Lcom/sun/xml/bind/v2/model/core/NonElement;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$7", "val$mp", "Lcom/sun/xml/bind/v2/model/core/MapPropertyInfo;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/MapPropertyInfo", "getValueType", "()Lcom/sun/xml/bind/v2/model/core/NonElement;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$2300", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;Lcom/sun/xml/bind/v2/schemagen/xmlschema/ExplicitGroup;Ljava/lang/String;Lcom/sun/xml/bind/v2/model/core/NonElement;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
