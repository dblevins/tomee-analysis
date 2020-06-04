package asm.org.eclipse.persistence.logging;
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
public class LogCategoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/logging/LogCategory", "Ljava/lang/Enum<Lorg/eclipse/persistence/logging/LogCategory;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ALL", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CACHE", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CONNECTION", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DDL", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DMS", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EJB", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EVENT", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JPA", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "JPARS", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "METADATA", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "METAMODEL", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MISC", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MONITORING", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROCESSOR", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROPAGATION", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PROPERTIES", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUERY", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SEQUENCING", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SERVER", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SQL", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TRANSACTION", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "WEAVER", "Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "length", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NAMESPACE_PREFIX", "Ljava/lang/String;", null, "eclipselink.logging.");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "stringValuesMap", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/persistence/logging/LogCategory;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "nameSpaces", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "levelNameSpaces", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "id", "B", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "name", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/logging/LogCategory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ALL");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("all");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "ALL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CACHE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("cache");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "CACHE", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CONNECTION");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("connection");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "CONNECTION", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DDL");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("ddl");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "DDL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DMS");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("dms");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "DMS", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EJB");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("ejb");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "EJB", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EVENT");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("event");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "EVENT", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPA");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("jpa");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "JPA", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JPARS");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("jpars");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "JPARS", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("METADATA");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("metadata");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "METADATA", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("METAMODEL");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("metamodel");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "METAMODEL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MISC");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("misc");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "MISC", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MONITORING");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("monitoring");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "MONITORING", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROCESSOR");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("processor");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "PROCESSOR", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROPAGATION");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("propagation");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "PROPAGATION", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PROPERTIES");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("properties");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "PROPERTIES", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUERY");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("query");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "QUERY", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEQUENCING");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("sequencing");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "SEQUENCING", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SERVER");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("server");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "SERVER", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SQL");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("sql");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "SQL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TRANSACTION");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitLdcInsn("transaction");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "TRANSACTION", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("WEAVER");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitLdcInsn("weaver");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/logging/LogCategory", "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "WEAVER", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "ALL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "CACHE", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "CONNECTION", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "DDL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "DMS", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "EJB", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "EVENT", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "JPA", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "JPARS", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "METADATA", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "METAMODEL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "MISC", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "MONITORING", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "PROCESSOR", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "PROPAGATION", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "PROPERTIES", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "QUERY", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "SEQUENCING", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "SERVER", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "SQL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "TRANSACTION", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "WEAVER", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "ENUM$VALUES", "[Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/logging/LogCategory", "values", "()[Lorg/eclipse/persistence/logging/LogCategory;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "length", "I");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "length", "I");
methodVisitor.visitInsn(IMUL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "stringValuesMap", "Ljava/util/Map;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "length", "I");
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "nameSpaces", "[Ljava/lang/String;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "length", "I");
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/logging/LogCategory", "levelNameSpaces", "[Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/logging/LogCategory", "values", "()[Lorg/eclipse/persistence/logging/LogCategory;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Lorg/eclipse/persistence/logging/LogCategory;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "stringValuesMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/logging/LogCategory", "values", "()[Lorg/eclipse/persistence/logging/LogCategory;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "nameSpaces", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "id", "B");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("eclipselink.logging.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "intern", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "levelNameSpaces", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "id", "B");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("eclipselink.logging.level.");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "intern", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "toValue", "(Ljava/lang/String;)Lorg/eclipse/persistence/logging/LogCategory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitJumpInsn(IFLE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "stringValuesMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toLowerCase", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/logging/LogCategory");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "ALL", "Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/eclipse/persistence/logging/LogCategory"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IBLjava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/logging/LogCategory", "id", "B");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/logging/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()B", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "id", "B");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "name", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNameSpace", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "nameSpaces", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "id", "B");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLogLevelProperty", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "levelNameSpaces", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/logging/LogCategory", "id", "B");
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/logging/LogCategory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/logging/LogCategory", "ENUM$VALUES", "[Lorg/eclipse/persistence/logging/LogCategory;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/logging/LogCategory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/logging/LogCategory;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/logging/LogCategory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
