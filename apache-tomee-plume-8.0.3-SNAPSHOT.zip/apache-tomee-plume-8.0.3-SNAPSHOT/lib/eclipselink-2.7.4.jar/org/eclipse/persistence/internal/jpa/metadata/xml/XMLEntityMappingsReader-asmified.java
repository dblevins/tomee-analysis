package asm.org.eclipse.persistence.internal.jpa.metadata.xml;
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
public class XMLEntityMappingsReaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_1_0_XSD", "Ljava/lang/String;", null, "org/eclipse/persistence/jpa/orm_1_0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_1_0_NAMESPACE", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/persistence/orm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_2_0_XSD", "Ljava/lang/String;", null, "org/eclipse/persistence/jpa/orm_2_0.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_2_0_NAMESPACE", "Ljava/lang/String;", null, "http://java.sun.com/xml/ns/persistence/orm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_2_1_XSD", "Ljava/lang/String;", null, "org/eclipse/persistence/jpa/orm_2_1.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_2_1_NAMESPACE", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/persistence/orm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_2_2_XSD", "Ljava/lang/String;", null, "org/eclipse/persistence/jpa/orm_2_2.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORM_2_2_NAMESPACE", "Ljava/lang/String;", null, "http://xmlns.jcp.org/xml/ns/persistence/orm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSELINK_ORM_XSD", "Ljava/lang/String;", null, "org/eclipse/persistence/jpa/eclipselink_orm_2_5.xsd");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSELINK_ORM_NAMESPACE", "Ljava/lang/String;", null, "http://www.eclipse.org/eclipselink/xsds/persistence/orm");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_orm1_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_orm2_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_orm2_1Project", "Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_orm2_2Project", "Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_eclipseLinkOrmProject", "Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_orm1_0Schema", "Ljavax/xml/validation/Schema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_orm2_0Schema", "Ljavax/xml/validation/Schema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_orm2_1Schema", "Ljavax/xml/validation/Schema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_orm2_2Schema", "Ljavax/xml/validation/Schema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "m_eclipseLinkOrmSchema", "Ljavax/xml/validation/Schema;", null, null);
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
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "determineXMLContextAndSchema", "(Ljava/lang/String;Ljava/io/Reader;Z)[Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getEclipseLinkOrmProject", "()Lorg/eclipse/persistence/oxm/XMLContext;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getEclipseLinkOrmSchema", "()Ljavax/xml/validation/Schema;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[Ljava/lang/Object;"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/XMLHelper", "createParserFactory", "(Z)Ljavax/xml/parsers/SAXParserFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/SAXParserFactory", "newSAXParser", "()Ljavax/xml/parsers/SAXParser;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/parsers/SAXParser", "getXMLReader", "()Lorg/xml/sax/XMLReader;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/xml/ORMContentHandler");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/xml/ORMContentHandler", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/XMLReader", "setContentHandler", "(Lorg/xml/sax/ContentHandler;)V", true);
methodVisitor.visitTypeInsn(NEW, "org/xml/sax/InputSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/xml/sax/InputSource", "<init>", "(Ljava/io/Reader;)V", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/XMLReader", "parse", "(Lorg/xml/sax/InputSource;)V", true);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/xml/ORMContentHandler", "isEclipseLink", "()Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getEclipseLinkOrmProject", "()Lorg/eclipse/persistence/oxm/XMLContext;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getEclipseLinkOrmSchema", "()Ljavax/xml/validation/Schema;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"java/lang/String", "java/io/Reader", Opcodes.INTEGER, "[Ljava/lang/Object;", "javax/xml/parsers/SAXParserFactory", "javax/xml/parsers/SAXParser", "org/xml/sax/XMLReader", "org/eclipse/persistence/internal/jpa/metadata/xml/ORMContentHandler", "org/xml/sax/InputSource"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/xml/ORMContentHandler", "getVersion", "()Ljava/lang/String;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/xml/ORMContentHandler", "getVersion", "()Ljava/lang/String;", false);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(I)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPNE, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getOrm1_0Project", "()Lorg/eclipse/persistence/oxm/XMLContext;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getOrm1_0Schema", "()Ljavax/xml/validation/Schema;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/xml/ORMContentHandler", "getVersion", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("2.0");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getOrm2_0Project", "()Lorg/eclipse/persistence/oxm/XMLContext;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getOrm2_0Schema", "()Ljavax/xml/validation/Schema;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/xml/ORMContentHandler", "getVersion", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("2.1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "indexOf", "(Ljava/lang/String;)I", false);
methodVisitor.visitInsn(ICONST_M1);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getOrm2_1Project", "()Lorg/eclipse/persistence/oxm/XMLContext;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getOrm2_1Schema", "()Ljavax/xml/validation/Schema;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getOrm2_2Project", "()Lorg/eclipse/persistence/oxm/XMLContext;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getOrm2_2Schema", "()Ljavax/xml/validation/Schema;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"java/lang/String", "java/io/Reader", Opcodes.INTEGER, "[Ljava/lang/Object;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getEclipseLinkOrmProject", "()Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_eclipseLinkOrmProject", "Lorg/eclipse/persistence/oxm/XMLContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.eclipse.org/eclipselink/xsds/persistence/orm");
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/eclipselink_orm_2_5.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLContext", "<init>", "(Lorg/eclipse/persistence/sessions/Project;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_eclipseLinkOrmProject", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_eclipseLinkOrmProject", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getEclipseLinkOrmSchema", "()Ljavax/xml/validation/Schema;", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_eclipseLinkOrmSchema", "Ljavax/xml/validation/Schema;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/eclipselink_orm_2_5.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "loadLocalSchema", "(Ljava/lang/String;)Ljavax/xml/validation/Schema;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_eclipseLinkOrmSchema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_eclipseLinkOrmSchema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "getInputStreamReader", "(Ljava/net/URL;)Ljava/io/InputStreamReader;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "openConnection", "()Ljava/net/URLConnection;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URLConnection", "setUseCaches", "(Z)V", false);
methodVisitor.visitTypeInsn(NEW, "java/io/InputStreamReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URLConnection", "getInputStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitLdcInsn("UTF-8");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/io/InputStreamReader", "<init>", "(Ljava/io/InputStream;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOrm1_0Project", "()Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm1_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/persistence/orm");
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/orm_1_0.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLContext", "<init>", "(Lorg/eclipse/persistence/sessions/Project;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm1_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm1_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOrm1_0Schema", "()Ljavax/xml/validation/Schema;", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm1_0Schema", "Ljavax/xml/validation/Schema;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/orm_1_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "loadLocalSchema", "(Ljava/lang/String;)Ljavax/xml/validation/Schema;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm1_0Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm1_0Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOrm2_0Project", "()Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/persistence/orm");
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/orm_2_0.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLContext", "<init>", "(Lorg/eclipse/persistence/sessions/Project;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOrm2_0Schema", "()Ljavax/xml/validation/Schema;", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_0Schema", "Ljavax/xml/validation/Schema;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/orm_2_0.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "loadLocalSchema", "(Ljava/lang/String;)Ljavax/xml/validation/Schema;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_0Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_0Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOrm2_1Project", "()Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_1Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/xml/ns/persistence/orm");
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/orm_2_1.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLContext", "<init>", "(Lorg/eclipse/persistence/sessions/Project;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_1Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_1Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOrm2_1Schema", "()Ljavax/xml/validation/Schema;", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_1Schema", "Ljavax/xml/validation/Schema;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/orm_2_1.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "loadLocalSchema", "(Ljava/lang/String;)Ljavax/xml/validation/Schema;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_1Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_1Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOrm2_2Project", "()Lorg/eclipse/persistence/oxm/XMLContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_2Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/oxm/XMLContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://xmlns.jcp.org/xml/ns/persistence/orm");
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/orm_2_2.xsd");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsMappingProject", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/oxm/XMLContext", "<init>", "(Lorg/eclipse/persistence/sessions/Project;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_2Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_2Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "getOrm2_2Schema", "()Ljavax/xml/validation/Schema;", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_2Schema", "Ljavax/xml/validation/Schema;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("org/eclipse/persistence/jpa/orm_2_2.xsd");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "loadLocalSchema", "(Ljava/lang/String;)Ljavax/xml/validation/Schema;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_2Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_2Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "clear", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm1_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_0Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_1Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_2Project", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_eclipseLinkOrmProject", "Lorg/eclipse/persistence/oxm/XMLContext;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm1_0Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_0Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_1Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_orm2_2Schema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "m_eclipseLinkOrmSchema", "Ljavax/xml/validation/Schema;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "isORMSchemaValidationPerformed", "(Ljava/util/Map;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("eclipselink.orm.validate.schema");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/EntityManagerFactoryProvider", "getConfigPropertyAsString", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equalsIgnoreCase", "(Ljava/lang/String;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "loadLocalSchema", "(Ljava/lang/String;)Ljavax/xml/validation/Schema;", null, new String[] { "java/io/IOException", "org/xml/sax/SAXException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, null);
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getClassLoader", "()Ljava/lang/ClassLoader;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/ClassLoader", "getResource", "(Ljava/lang/String;)Ljava/net/URL;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "openStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label0);
methodVisitor.visitTypeInsn(NEW, "javax/xml/transform/stream/StreamSource");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "openStream", "()Ljava/io/InputStream;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/transform/stream/StreamSource", "<init>", "(Ljava/io/InputStream;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/XMLHelper", "createSchemaFactory", "(Ljava/lang/String;Z)Ljavax/xml/validation/SchemaFactory;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/validation/SchemaFactory", "newSchema", "(Ljavax/xml/transform/Source;)Ljavax/xml/validation/Schema;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"java/lang/String", "java/net/URL", "java/io/InputStream"}, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStream", "close", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(3, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "read", "(Ljava/lang/String;Ljava/io/Reader;Ljava/lang/ClassLoader;Ljava/util/Map;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "read", "(Ljava/lang/String;Ljava/io/Reader;Ljava/io/Reader;Ljava/lang/ClassLoader;Ljava/util/Map;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_STATIC, "read", "(Ljava/lang/String;Ljava/io/Reader;Ljava/io/Reader;Ljava/lang/ClassLoader;Ljava/util/Map;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "isORMSchemaValidationPerformed", "(Ljava/util/Map;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "determineXMLContextAndSchema", "(Ljava/lang/String;Ljava/io/Reader;Z)[Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/oxm/XMLContext");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLContext", "createUnmarshaller", "()Lorg/eclipse/persistence/oxm/XMLUnmarshaller;", false);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ILOAD, 5);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/validation/Schema");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "useLocalSchemaForUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;Ljavax/xml/validation/Schema;)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"java/lang/String", "java/io/Reader", "java/io/Reader", "java/lang/ClassLoader", "java/util/Map", Opcodes.INTEGER, Opcodes.TOP, "[Ljava/lang/Object;", "org/eclipse/persistence/oxm/XMLUnmarshaller"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLUnmarshaller", "unmarshal", "(Ljava/io/Reader;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label1);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"java/lang/String", "java/io/Reader", "java/io/Reader", "java/lang/ClassLoader", "java/util/Map", Opcodes.INTEGER}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "errorParsingMappingFile", "(Ljava/lang/String;Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings", "setMappingFile", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "read", "(Ljava/net/URL;Ljava/lang/ClassLoader;Ljava/util/Properties;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/io/IOException");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label0, label4, "java/io/UnsupportedEncodingException");
Label label5 = new Label();
methodVisitor.visitTryCatchBlock(label3, label0, label5, null);
methodVisitor.visitTryCatchBlock(label4, label5, label5, null);
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
methodVisitor.visitTryCatchBlock(label6, label7, label8, "java/io/IOException");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getInputStreamReader", "(Ljava/net/URL;)Ljava/io/InputStreamReader;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "getInputStreamReader", "(Ljava/net/URL;)Ljava/io/InputStreamReader;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/net/URL", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader", "read", "(Ljava/lang/String;Ljava/io/Reader;Ljava/io/Reader;Ljava/lang/ClassLoader;Ljava/util/Map;)Lorg/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings;", false);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label9);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStreamReader", "close", "()V", false);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_FULL, 8, new Object[] {"java/net/URL", "java/lang/ClassLoader", "java/util/Properties", "java/io/InputStreamReader", "java/io/InputStreamReader", Opcodes.TOP, Opcodes.TOP, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappings"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label10);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStreamReader", "close", "()V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitJumpInsn(GOTO, label10);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "fileError", "(Ljava/io/IOException;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"java/net/URL", "java/lang/ClassLoader", "java/util/Properties", "java/io/InputStreamReader", "java/io/InputStreamReader"}, 1, new Object[] {"java/io/UnsupportedEncodingException"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "fatalErrorOccurred", "(Ljava/lang/Exception;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStreamReader", "close", "()V", false);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_FULL, 7, new Object[] {"java/net/URL", "java/lang/ClassLoader", "java/util/Properties", "java/io/InputStreamReader", "java/io/InputStreamReader", Opcodes.TOP, "java/lang/Throwable"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 4);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/InputStreamReader", "close", "()V", false);
methodVisitor.visitLabel(label7);
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/io/IOException"});
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/exceptions/ValidationException", "fileError", "(Ljava/io/IOException;)Lorg/eclipse/persistence/exceptions/ValidationException;", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "useLocalSchemaForUnmarshaller", "(Lorg/eclipse/persistence/oxm/XMLUnmarshaller;Ljavax/xml/validation/Schema;)V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/UnsupportedOperationException");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metadata/xml/XMLEntityMappingsReader$1", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLUnmarshaller", "setErrorHandler", "(Lorg/xml/sax/ErrorHandler;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLUnmarshaller", "setSchema", "(Ljavax/xml/validation/Schema;)V", false);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/UnsupportedOperationException"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/oxm/XMLUnmarshaller", "setValidationMode", "(I)V", false);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
