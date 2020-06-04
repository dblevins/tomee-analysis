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
public class XmlSchemaGenerator$Namespace$4Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", null, "com/sun/xml/bind/v2/schemagen/Tree$Term", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "handleReferenceProp", "(Lcom/sun/xml/bind/v2/model/core/ReferencePropertyInfo;)Lcom/sun/xml/bind/v2/schemagen/Tree;");

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator", "Namespace", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/Tree$Term", "com/sun/xml/bind/v2/schemagen/Tree", "Term", ACC_STATIC | ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$e", "Lcom/sun/xml/bind/v2/model/core/Element;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;Lcom/sun/xml/bind/v2/model/core/Element;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "val$e", "Lcom/sun/xml/bind/v2/model/core/Element;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/schemagen/Tree$Term", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "write", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer;ZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer", "element", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "val$e", "Lcom/sun/xml/bind/v2/model/core/Element;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/Element", "getElementName", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "val$e", "Lcom/sun/xml/bind/v2/model/core/Element;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/Element", "getScope", "()Lcom/sun/xml/bind/v2/model/core/ClassInfo;", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "uri", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 7);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "com/sun/xml/bind/v2/schemagen/xmlschema/ContentModelContainer", Opcodes.INTEGER, Opcodes.INTEGER, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", Opcodes.INTEGER, "javax/xml/namespace/QName", Opcodes.INTEGER, Opcodes.INTEGER}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 8);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$1900", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;)Lcom/sun/xml/bind/v2/schemagen/Form;", false);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/Form", "isEffectivelyQualified", "Z");
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("unqualified");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "form", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$1900", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;)Lcom/sun/xml/bind/v2/schemagen/Form;", false);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/Form", "isEffectivelyQualified", "Z");
methodVisitor.visitJumpInsn(IFNE, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("qualified");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "form", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "name", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "val$e", "Lcom/sun/xml/bind/v2/model/core/Element;");
methodVisitor.visitTypeInsn(INSTANCEOF, "com/sun/xml/bind/v2/model/core/ClassInfo");
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "val$e", "Lcom/sun/xml/bind/v2/model/core/Element;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/model/core/ClassInfo");
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$2100", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;Lcom/sun/xml/bind/v2/schemagen/xmlschema/TypeHost;Lcom/sun/xml/bind/v2/model/core/NonElement;Ljava/lang/String;)V", false);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "val$e", "Lcom/sun/xml/bind/v2/model/core/Element;");
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/model/core/ElementInfo");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/model/core/ElementInfo", "getContentType", "()Lcom/sun/xml/bind/v2/model/core/NonElement;", true);
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$2100", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;Lcom/sun/xml/bind/v2/schemagen/xmlschema/TypeHost;Lcom/sun/xml/bind/v2/model/core/NonElement;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNE, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/LocalElement", "ref", "(Ljavax/xml/namespace/QName;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/LocalElement;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$4", "writeOccurs", "(Lcom/sun/xml/bind/v2/schemagen/xmlschema/Occurs;ZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 9);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
