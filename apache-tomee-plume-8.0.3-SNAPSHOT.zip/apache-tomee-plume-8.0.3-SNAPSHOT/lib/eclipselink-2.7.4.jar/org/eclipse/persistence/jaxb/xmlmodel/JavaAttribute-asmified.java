package asm.org.eclipse.persistence.jaxb.xmlmodel;
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
public class JavaAttributeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/eclipse/persistence/jaxb/xmlmodel/JavaAttribute", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlAccessorType;", true);
annotationVisitor0.visitEnum("value", "Ljavax/xml/bind/annotation/XmlAccessType;", "FIELD");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlType;", true);
annotationVisitor0.visit("name", "java-attribute");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlSeeAlso;", true);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlValue;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVariableNode;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlElementRefs;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlInverseReference;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAttribute;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlJavaTypeAdapter;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAnyAttribute;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransient;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlElement;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAnyElement;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlJoinNodes;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlElements;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlTransformation;"));
annotationVisitor1.visit(null, Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlElementRef;"));
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "javaAttribute", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlAttribute;", true);
annotationVisitor0.visit("name", "java-attribute");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "xmlAccessorType", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAccessType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljavax/xml/bind/annotation/XmlAttribute;", true);
annotationVisitor0.visit("name", "xml-accessor-type");
annotationVisitor0.visitEnd();
}
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJavaAttribute", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/xmlmodel/JavaAttribute", "javaAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setJavaAttribute", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/xmlmodel/JavaAttribute", "javaAttribute", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getXmlAccessorType", "()Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAccessType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/jaxb/xmlmodel/JavaAttribute", "xmlAccessorType", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAccessType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setXmlAccessorType", "(Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAccessType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/jaxb/xmlmodel/JavaAttribute", "xmlAccessorType", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlAccessType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
