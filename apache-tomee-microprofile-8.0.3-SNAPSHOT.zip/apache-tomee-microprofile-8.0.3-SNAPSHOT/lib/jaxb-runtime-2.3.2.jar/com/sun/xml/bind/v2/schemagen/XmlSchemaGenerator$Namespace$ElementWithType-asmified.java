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
public class XmlSchemaGenerator$Namespace$ElementWithTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator<TT;TC;TF;TM;>.Namespace.ElementDeclaration;", "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementDeclaration", null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator", "Namespace", ACC_PRIVATE);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "ElementWithType", 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementDeclaration", "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "ElementDeclaration", ACC_ABSTRACT);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "nillable", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Lcom/sun/xml/bind/v2/model/core/NonElement;", "Lcom/sun/xml/bind/v2/model/core/NonElement<TT;TC;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;ZLcom/sun/xml/bind/v2/model/core/NonElement;)V", "(ZLcom/sun/xml/bind/v2/model/core/NonElement<TT;TC;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementDeclaration", "<init>", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "type", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "nillable", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "writeTo", "(Ljava/lang/String;Lcom/sun/xml/bind/v2/schemagen/xmlschema/Schema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/Schema", "element", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/TopLevelElement;", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/TopLevelElement", "name", "(Ljava/lang/String;)Lcom/sun/xml/bind/v2/schemagen/xmlschema/TopLevelElement;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "nillable", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/TopLevelElement", "nillable", "(Z)Lcom/sun/xml/bind/v2/schemagen/xmlschema/Element;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"com/sun/xml/bind/v2/schemagen/xmlschema/TopLevelElement"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "type", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "this$1", "Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "type", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
methodVisitor.visitLdcInsn("type");
methodVisitor.visitMethodInsn(INVOKESTATIC, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace", "access$2100", "(Lcom/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace;Lcom/sun/xml/bind/v2/schemagen/xmlschema/TypeHost;Lcom/sun/xml/bind/v2/model/core/NonElement;Ljava/lang/String;)V", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/TopLevelElement", "complexType", "()Lcom/sun/xml/bind/v2/schemagen/xmlschema/ComplexType;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/TopLevelElement", "commit", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "type", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "type", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/schemagen/XmlSchemaGenerator$Namespace$ElementWithType", "type", "Lcom/sun/xml/bind/v2/model/core/NonElement;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
