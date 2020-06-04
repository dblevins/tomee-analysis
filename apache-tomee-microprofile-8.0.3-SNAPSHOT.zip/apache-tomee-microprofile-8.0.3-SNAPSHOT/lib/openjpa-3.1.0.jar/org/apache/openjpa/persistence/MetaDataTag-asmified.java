package asm.org.apache.openjpa.persistence;
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
public class MetaDataTagDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/MetaDataTag", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/MetaDataTag;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ACCESS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "CACHEABLE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAPPED_SUPERCLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTITY", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EMBEDDABLE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ENTITY_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FLUSH_MODE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GENERATED_VALUE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ID", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EMBEDDED_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXCLUDE_DEFAULT_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXCLUDE_SUPERCLASS_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ID_CLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOB", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP_KEY", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP_KEY_CLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAPPED_BY_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NATIVE_QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NATIVE_QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUERY_STRING", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ORDER_BY", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ORDER_COLUMN", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "QUERY_HINT", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_LOAD", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_PERSIST", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_REMOVE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "POST_UPDATE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_PERSIST", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_REMOVE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PRE_UPDATE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SEQ_GENERATOR", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VERSION", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATA_CACHE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DATASTORE_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DETACHED_STATE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ELEM_TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXTERNAL_VALS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXTERNAL_VAL", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EXTERNALIZER", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FACTORY", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FETCH_GROUPS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FETCH_ATTRIBUTE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REFERENCED_FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INVERSE_LOGICAL", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "KEY_TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LOAD_FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LRS", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MANAGED_INTERFACE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "READ_ONLY", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REPLICATED", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "OPENJPA_VERSION", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOREDPROCEDURE_QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STOREDPROCEDURE_QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "$VALUES", "[Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/MetaDataTag;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/MetaDataTag;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/MetaDataTag;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ACCESS");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ACCESS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CACHEABLE");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "CACHEABLE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAPPED_SUPERCLASS");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MAPPED_SUPERCLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTITY");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ENTITY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EMBEDDABLE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EMBEDDABLE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ENTITY_LISTENERS");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ENTITY_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLUSH_MODE");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FLUSH_MODE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GENERATED_VALUE");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "GENERATED_VALUE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ID");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ID", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EMBEDDED_ID");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EMBEDDED_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXCLUDE_DEFAULT_LISTENERS");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXCLUDE_DEFAULT_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXCLUDE_SUPERCLASS_LISTENERS");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXCLUDE_SUPERCLASS_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ID_CLASS");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ID_CLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOB");
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "LOB", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP_KEY");
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MAP_KEY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP_KEY_CLASS");
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MAP_KEY_CLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAPPED_BY_ID");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MAPPED_BY_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NATIVE_QUERIES");
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "NATIVE_QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NATIVE_QUERY");
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "NATIVE_QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUERY_STRING");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "QUERY_STRING", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ORDER_BY");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ORDER_BY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ORDER_COLUMN");
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ORDER_COLUMN", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUERIES");
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUERY");
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QUERY_HINT");
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "QUERY_HINT", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_LOAD");
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "POST_LOAD", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_PERSIST");
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "POST_PERSIST", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_REMOVE");
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "POST_REMOVE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("POST_UPDATE");
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "POST_UPDATE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_PERSIST");
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "PRE_PERSIST", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_REMOVE");
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "PRE_REMOVE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PRE_UPDATE");
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "PRE_UPDATE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SEQ_GENERATOR");
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "SEQ_GENERATOR", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VERSION");
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "VERSION", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATA_CACHE");
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "DATA_CACHE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATASTORE_ID");
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "DATASTORE_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DEPENDENT");
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DETACHED_STATE");
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "DETACHED_STATE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_DEPENDENT");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ELEM_DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ELEM_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ELEM_TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXTERNAL_VALS");
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXTERNAL_VALS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXTERNAL_VAL");
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXTERNAL_VAL", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EXTERNALIZER");
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXTERNALIZER", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FACTORY");
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FACTORY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FETCH_GROUP");
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FETCH_GROUPS");
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FETCH_GROUPS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FETCH_ATTRIBUTE");
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FETCH_ATTRIBUTE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REFERENCED_FETCH_GROUP");
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "REFERENCED_FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INVERSE_LOGICAL");
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "INVERSE_LOGICAL", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_DEPENDENT");
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "KEY_DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("KEY_TYPE");
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "KEY_TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LOAD_FETCH_GROUP");
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "LOAD_FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LRS");
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "LRS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MANAGED_INTERFACE");
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MANAGED_INTERFACE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("READ_ONLY");
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "READ_ONLY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TYPE");
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REPLICATED");
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "REPLICATED", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("OPENJPA_VERSION");
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "OPENJPA_VERSION", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOREDPROCEDURE_QUERIES");
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "STOREDPROCEDURE_QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STOREDPROCEDURE_QUERY");
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/MetaDataTag", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "STOREDPROCEDURE_QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitIntInsn(BIPUSH, 60);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/MetaDataTag");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ACCESS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "CACHEABLE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MAPPED_SUPERCLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ENTITY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EMBEDDABLE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ENTITY_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FLUSH_MODE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "GENERATED_VALUE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ID", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EMBEDDED_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXCLUDE_DEFAULT_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXCLUDE_SUPERCLASS_LISTENERS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ID_CLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "LOB", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MAP_KEY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MAP_KEY_CLASS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MAPPED_BY_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "NATIVE_QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "NATIVE_QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "QUERY_STRING", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ORDER_BY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 21);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ORDER_COLUMN", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 22);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 23);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 24);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "QUERY_HINT", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 25);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "POST_LOAD", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 26);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "POST_PERSIST", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 27);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "POST_REMOVE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 28);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "POST_UPDATE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 29);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "PRE_PERSIST", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 30);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "PRE_REMOVE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "PRE_UPDATE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "SEQ_GENERATOR", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "VERSION", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 34);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "DATA_CACHE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 35);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "DATASTORE_ID", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 36);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 37);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "DETACHED_STATE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ELEM_DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 39);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "ELEM_TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 40);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXTERNAL_VALS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 41);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXTERNAL_VAL", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "EXTERNALIZER", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FACTORY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 44);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FETCH_GROUPS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "FETCH_ATTRIBUTE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 47);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "REFERENCED_FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 48);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "INVERSE_LOGICAL", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 49);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "KEY_DEPENDENT", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 50);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "KEY_TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 51);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "LOAD_FETCH_GROUP", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 52);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "LRS", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 53);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "MANAGED_INTERFACE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "READ_ONLY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 55);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "TYPE", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 56);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "REPLICATED", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 57);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "OPENJPA_VERSION", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 58);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "STOREDPROCEDURE_QUERIES", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 59);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "STOREDPROCEDURE_QUERY", "Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/MetaDataTag", "$VALUES", "[Lorg/apache/openjpa/persistence/MetaDataTag;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
