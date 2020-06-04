package asm.com.ibm.wsdl.extensions.schema;
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
public class SchemaConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "com/ibm/wsdl/extensions/schema/SchemaConstants", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTR_ID", "Ljava/lang/String;", null, "id");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ATTR_SCHEMA_LOCATION", "Ljava/lang/String;", null, "schemaLocation");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ELEM_SCHEMA", "Ljava/lang/String;", null, "schema");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ELEM_INCLUDE", "Ljava/lang/String;", null, "include");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ELEM_REDEFINE", "Ljava/lang/String;", null, "redefine");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_URI_XSD_1999", "Ljava/lang/String;", null, "http://www.w3.org/1999/XMLSchema");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_URI_XSD_2000", "Ljava/lang/String;", null, "http://www.w3.org/2000/10/XMLSchema");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NS_URI_XSD_2001", "Ljava/lang/String;", null, "http://www.w3.org/2001/XMLSchema");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_XSD_1999", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_XSD_2000", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_XSD_2001", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XSD_QNAME_LIST", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_IMPORT_XSD_1999", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_IMPORT_XSD_2000", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_IMPORT_XSD_2001", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XSD_IMPORT_QNAME_LIST", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_INCLUDE_XSD_1999", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_INCLUDE_XSD_2000", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_INCLUDE_XSD_2001", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XSD_INCLUDE_QNAME_LIST", "Ljava/util/List;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_REDEFINE_XSD_1999", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_REDEFINE_XSD_2000", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "Q_ELEM_REDEFINE_XSD_2001", "Ljavax/xml/namespace/QName;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "XSD_REDEFINE_QNAME_LIST", "Ljava/util/List;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/1999/XMLSchema");
methodVisitor.visitLdcInsn("schema");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_XSD_1999", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/10/XMLSchema");
methodVisitor.visitLdcInsn("schema");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_XSD_2000", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("schema");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_XSD_2001", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_XSD_1999", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_XSD_2000", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_XSD_2001", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "XSD_QNAME_LIST", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/1999/XMLSchema");
methodVisitor.visitLdcInsn("import");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_IMPORT_XSD_1999", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/10/XMLSchema");
methodVisitor.visitLdcInsn("import");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_IMPORT_XSD_2000", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("import");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_IMPORT_XSD_2001", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_IMPORT_XSD_1999", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_IMPORT_XSD_2000", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_IMPORT_XSD_2001", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "XSD_IMPORT_QNAME_LIST", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/1999/XMLSchema");
methodVisitor.visitLdcInsn("include");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_INCLUDE_XSD_1999", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/10/XMLSchema");
methodVisitor.visitLdcInsn("include");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_INCLUDE_XSD_2000", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("include");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_INCLUDE_XSD_2001", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_INCLUDE_XSD_1999", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_INCLUDE_XSD_2000", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_INCLUDE_XSD_2001", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "XSD_INCLUDE_QNAME_LIST", "Ljava/util/List;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/1999/XMLSchema");
methodVisitor.visitLdcInsn("redefine");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_REDEFINE_XSD_1999", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2000/10/XMLSchema");
methodVisitor.visitLdcInsn("redefine");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_REDEFINE_XSD_2000", "Ljavax/xml/namespace/QName;");
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("redefine");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_REDEFINE_XSD_2001", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_REDEFINE_XSD_1999", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_REDEFINE_XSD_2000", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "Q_ELEM_REDEFINE_XSD_2001", "Ljavax/xml/namespace/QName;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Arrays", "asList", "([Ljava/lang/Object;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/ibm/wsdl/extensions/schema/SchemaConstants", "XSD_REDEFINE_QNAME_LIST", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
