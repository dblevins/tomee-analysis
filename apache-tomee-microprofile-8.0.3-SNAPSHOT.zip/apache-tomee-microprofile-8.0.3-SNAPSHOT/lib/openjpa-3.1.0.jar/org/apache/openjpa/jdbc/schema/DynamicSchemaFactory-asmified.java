package asm.org.apache.openjpa.jdbc.schema;
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
public class DynamicSchemaFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", null, "org/apache/openjpa/jdbc/schema/SchemaGroup", new String[] { "org/apache/openjpa/jdbc/schema/SchemaFactory", "org/apache/openjpa/lib/conf/Configurable" });

classWriter.visitInnerClass("org/apache/openjpa/jdbc/schema/DynamicSchemaFactory$DynamicColumn", "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "DynamicColumn", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/schema/DynamicSchemaFactory$DynamicTable", "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "DynamicTable", ACC_PRIVATE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_TRANSIENT, "_dict", "Lorg/apache/openjpa/jdbc/sql/DBDictionary;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_schema", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/SchemaGroup", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "_dict", "Lorg/apache/openjpa/jdbc/sql/DBDictionary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier", "NULL", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "_schema", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConfiguration", "(Lorg/apache/openjpa/lib/conf/Configuration;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/jdbc/conf/JDBCConfiguration");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/conf/JDBCConfiguration", "getDBDictionaryInstance", "()Lorg/apache/openjpa/jdbc/sql/DBDictionary;", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "_dict", "Lorg/apache/openjpa/jdbc/sql/DBDictionary;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/conf/JDBCConfiguration", "getSchema", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier", "newSchema", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "_schema", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "startConfiguration", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "endConfiguration", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "readSchema", "()Lorg/apache/openjpa/jdbc/schema/SchemaGroup;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "storeSchema", "(Lorg/apache/openjpa/jdbc/schema/SchemaGroup;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isKnownTable", "(Lorg/apache/openjpa/jdbc/schema/Table;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/SchemaGroup", "findTable", "(Lorg/apache/openjpa/jdbc/schema/Table;)Lorg/apache/openjpa/jdbc/schema/Table;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isKnownTable", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/SchemaGroup", "findTable", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/schema/Table;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isKnownTable", "(Lorg/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/SchemaGroup", "findTable", "(Lorg/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Table;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findTable", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/schema/Table;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/SchemaGroup", "findTable", "(Ljava/lang/String;)Lorg/apache/openjpa/jdbc/schema/Table;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findTable", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Table;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier", "getPath", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Lorg/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "findTable", "(Lorg/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Table;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "findTable", "(Lorg/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Table;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier", "isNull", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/SchemaGroup", "findTable", "(Lorg/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Table;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/jdbc/schema/Table"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier", "NULL", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier", "getUnqualifiedName", "()Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier", "getSchemaName", "()Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/identifier/DBIdentifier", "isNull", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNE, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/identifier/QualifiedDBIdentifier", "getSchemaName", "()Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", false);
methodVisitor.visitVarInsn(ASTORE, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openjpa/jdbc/identifier/DBIdentifier", "org/apache/openjpa/jdbc/identifier/DBIdentifier"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "_schema", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "getSchema", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Schema;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "addSchema", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Schema;", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/jdbc/schema/Schema"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/identifier/DBIdentifier", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "length", "()I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "_dict", "Lorg/apache/openjpa/jdbc/sql/DBDictionary;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/DBDictionary", "maxTableNameLength", "I");
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "_dict", "Lorg/apache/openjpa/jdbc/sql/DBDictionary;");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "getSchema", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Schema;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/DBDictionary", "getValidTableName", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Schema;)Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/Schema", "addTable", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Table;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/Schema", "addTable", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)Lorg/apache/openjpa/jdbc/schema/Table;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newTable", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Schema;)Lorg/apache/openjpa/jdbc/schema/Table;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory$DynamicTable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory$DynamicTable", "<init>", "(Lorg/apache/openjpa/jdbc/schema/DynamicSchemaFactory;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Schema;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newColumn", "(Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;)Lorg/apache/openjpa/jdbc/schema/Column;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory$DynamicColumn");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory$DynamicColumn", "<init>", "(Lorg/apache/openjpa/jdbc/schema/DynamicSchemaFactory;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/openjpa/jdbc/schema/DynamicSchemaFactory;)Lorg/apache/openjpa/jdbc/sql/DBDictionary;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/schema/DynamicSchemaFactory", "_dict", "Lorg/apache/openjpa/jdbc/sql/DBDictionary;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
