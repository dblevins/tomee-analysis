package asm.org.apache.xml.security.binding.xmldsig11;
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
public class ECKeyValueTypeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", null, "java/lang/Object", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlAccessorType;", true);
annotationVisitor0.visitEnum("value", "Ljakarta/xml/bind/annotation/XmlAccessType;", "FIELD");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/xml/bind/annotation/XmlType;", true);
annotationVisitor0.visit("name", "ECKeyValueType");
annotationVisitor0.visit("namespace", "http://www.w3.org/2009/xmldsig11#");
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("propOrder");
annotationVisitor1.visit(null, "ecParameters");
annotationVisitor1.visit(null, "namedCurve");
annotationVisitor1.visit(null, "publicKey");
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "ecParameters", "Lorg/apache/xml/security/binding/xmldsig11/ECParametersType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "ECParameters");
annotationVisitor0.visit("namespace", "http://www.w3.org/2009/xmldsig11#");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "namedCurve", "Lorg/apache/xml/security/binding/xmldsig11/NamedCurveType;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "NamedCurve");
annotationVisitor0.visit("namespace", "http://www.w3.org/2009/xmldsig11#");
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "publicKey", "[B", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlElement;", true);
annotationVisitor0.visit("name", "PublicKey");
annotationVisitor0.visit("namespace", "http://www.w3.org/2009/xmldsig11#");
annotationVisitor0.visit("required", Boolean.TRUE);
annotationVisitor0.visitEnd();
}
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "id", "Ljava/lang/String;", null, null);
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlAttribute;", true);
annotationVisitor0.visit("name", "Id");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/adapters/XmlJavaTypeAdapter;", true);
annotationVisitor0.visit("value", Type.getType("Ljakarta/xml/bind/annotation/adapters/CollapsedStringAdapter;"));
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlID;", true);
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = fieldVisitor.visitAnnotation("Ljakarta/xml/bind/annotation/XmlSchemaType;", true);
annotationVisitor0.visit("name", "ID");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getECParameters", "()Lorg/apache/xml/security/binding/xmldsig11/ECParametersType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", "ecParameters", "Lorg/apache/xml/security/binding/xmldsig11/ECParametersType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setECParameters", "(Lorg/apache/xml/security/binding/xmldsig11/ECParametersType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", "ecParameters", "Lorg/apache/xml/security/binding/xmldsig11/ECParametersType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNamedCurve", "()Lorg/apache/xml/security/binding/xmldsig11/NamedCurveType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", "namedCurve", "Lorg/apache/xml/security/binding/xmldsig11/NamedCurveType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNamedCurve", "(Lorg/apache/xml/security/binding/xmldsig11/NamedCurveType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", "namedCurve", "Lorg/apache/xml/security/binding/xmldsig11/NamedCurveType;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPublicKey", "()[B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", "publicKey", "[B");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPublicKey", "([B)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", "publicKey", "[B");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setId", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xml/security/binding/xmldsig11/ECKeyValueType", "id", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
