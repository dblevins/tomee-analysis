package asm.org.eclipse.persistence.platform.database;
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
public class MaxDBPlatformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/platform/database/MaxDBPlatform", null, "org/eclipse/persistence/platform/database/DatabasePlatform", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FIELD_TYPE_DEFINITION_CLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "FIELD_TYPE_DEFINITION_BLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MAX_VARCHAR_UNICODE_LENGTH", "I", null, new Integer(4000));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LONG UNICODE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "FIELD_TYPE_DEFINITION_CLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LONG BYTE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "FIELD_TYPE_DEFINITION_BLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isForUpdateCompatibleWithDistinct", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSelectForUpdateString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(" WITH LOCK EXCLUSIVE");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSelectForUpdateNoWaitString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(" WITH LOCK (NOWAIT) EXCLUSIVE");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/DatabasePlatform", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SELECT 1 FROM DUAL");
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/platform/database/MaxDBPlatform", "pingSQL", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "buildFieldTypes", "()Ljava/util/Hashtable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/Hashtable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/Hashtable", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SMALLINT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Number;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DOUBLE PRECISION");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Short;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SMALLINT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Integer;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INTEGER");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Long;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FIXED");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Float;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FLOAT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Double;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DOUBLE PRECISION");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigInteger;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FIXED");
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/math/BigDecimal;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FIXED");
methodVisitor.visitIntInsn(BIPUSH, 38);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Character;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("CHAR");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("UNICODE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Character;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VARCHAR");
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitLdcInsn("UNICODE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("[C"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VARCHAR");
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitLdcInsn("UNICODE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/String;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VARCHAR");
methodVisitor.visitIntInsn(SIPUSH, 255);
methodVisitor.visitLdcInsn("UNICODE");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Byte;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SMALLINT");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Byte;"));
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "FIELD_TYPE_DEFINITION_BLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("[B"));
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "FIELD_TYPE_DEFINITION_BLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Blob;"));
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "FIELD_TYPE_DEFINITION_BLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Clob;"));
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "FIELD_TYPE_DEFINITION_CLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Date;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DATE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Time;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIME");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/sql/Timestamp;"));
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("TIMESTAMP");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "<init>", "(Ljava/lang/String;Z)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Hashtable", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(7, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsIndividualTableLocking", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "printFieldTypeSize", "(Ljava/io/Writer;Lorg/eclipse/persistence/tools/schemaframework/FieldDefinition;Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn("VARCHAR");
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitLdcInsn("UNICODE");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "getTypesuffix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/tools/schemaframework/FieldDefinition", "getSize", "()I", false);
methodVisitor.visitIntInsn(SIPUSH, 4000);
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "FIELD_TYPE_DEFINITION_CLOB", "Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/DatabasePlatform", "printFieldTypeSize", "(Ljava/io/Writer;Lorg/eclipse/persistence/tools/schemaframework/FieldDefinition;Lorg/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "getTypesuffix", "()Ljava/lang/String;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn(" ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/databaseaccess/FieldTypeDefinition", "getTypesuffix", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/io/Writer", "append", "(Ljava/lang/CharSequence;)Ljava/io/Writer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "initializePlatformOperators", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/DatabasePlatform", "initializePlatformOperators", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createConcatExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createTrim2ExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createToNumberOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createNullifOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createCoalesceOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createTodayExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createCurrentDateExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createCurrentTimeExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/platform/database/MaxDBPlatform", "createNullValueOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addNonBindingOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createConcatExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 31);
methodVisitor.visitLdcInsn("||");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleLogicalNoParens", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createTodayExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 54);
methodVisitor.visitLdcInsn("TIMESTAMP");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleLogicalNoParens", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createCurrentDateExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 123);
methodVisitor.visitLdcInsn("DATE");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleLogicalNoParens", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createCurrentTimeExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 128);
methodVisitor.visitLdcInsn("TIME");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleLogicalNoParens", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createTrim2ExpressionOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 121);
methodVisitor.visitLdcInsn("TRIM");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleTwoArgumentFunction", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createNullValueOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 104);
methodVisitor.visitLdcInsn("VALUE");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleTwoArgumentFunction", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createCoalesceOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "coalesce", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/expressions/ListExpressionOperator");
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("VALUE(");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ListExpressionOperator", "setStartString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 132);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ListExpressionOperator", "setSelector", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createToNumberOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitLdcInsn("NUM");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/expressions/ExpressionOperator", "simpleFunction", "(ILjava/lang/String;)Lorg/eclipse/persistence/expressions/ExpressionOperator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "createNullifOperator", "()Lorg/eclipse/persistence/expressions/ExpressionOperator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/expressions/ExpressionOperator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/expressions/ExpressionOperator", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "setType", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitIntInsn(SIPUSH, 131);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "setSelector", "(I)V", false);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/NonSynchronizedVector", "newInstance", "(I)Lorg/eclipse/persistence/internal/helper/NonSynchronizedVector;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" (CASE WHEN ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" = ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" THEN NULL ELSE ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(" END) ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/Vector", "addElement", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "printsAs", "(Ljava/util/Vector;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "bePrefix", "()V", false);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(NEWARRAY, T_INT);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IASTORE);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "setArgumentIndices", "([I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/ClassConstants", "FunctionExpression_Class", "Ljava/lang/Class;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "setNodeClass", "(Ljava/lang/Class;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "shouldOptimizeDataConversion", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "addNonBindingOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/expressions/ExpressionOperator", "setIsBindingSupported", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/platform/database/MaxDBPlatform", "addOperator", "(Lorg/eclipse/persistence/expressions/ExpressionOperator;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "supportsNativeSequenceNumbers", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "buildSelectQueryForSequenceObject", "(Ljava/lang/String;Ljava/lang/Integer;)Lorg/eclipse/persistence/queries/ValueReadQuery;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/queries/ValueReadQuery");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SELECT ");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn(".NEXTVAL FROM DUAL");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/queries/ValueReadQuery", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_FINAL, "getCreateTempTableSqlPrefix", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("CREATE TABLE ");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMaxFieldNameSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(BIPUSH, 32);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "supportsLocalTempTables", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getTempTableForTable", "(Lorg/eclipse/persistence/internal/helper/DatabaseTable;)Lorg/eclipse/persistence/internal/helper/DatabaseTable;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/DatabaseTable");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("$");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/DatabaseTable", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("TEMP");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/DatabaseTable", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "isMaxDB", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "shouldAlwaysUseTempStorageForModifyAll", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "shouldBindLiterals", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "shouldPrintOuterJoinInWhereClause", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "shouldUseJDBCOuterJoinSyntax", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportsSequenceObjects", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "supportsStoredFunctions", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "canBatchWriteWithOptimisticLocking", "(Lorg/eclipse/persistence/internal/databaseaccess/DatabaseCall;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
