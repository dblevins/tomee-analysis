package asm.org.apache.openjpa.jdbc.meta.strats;
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
public class MaxEmbeddedByteArrayFieldStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", null, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", null);

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "_loc", "Lorg/apache/openjpa/lib/util/Localizer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_maxSize", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "_maxSize", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getExpectedJavaType", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitIntInsn(SIPUSH, 1004);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "update", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/sql/Row;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "getValue", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitTypeInsn(CHECKCAST, "[B");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Row", "setBytes", "(Lorg/apache/openjpa/jdbc/schema/Column;[B)V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Row", "setBytes", "(Lorg/apache/openjpa/jdbc/schema/Column;[B)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "isCustom", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getIndex", "()I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/OpenJPAStateManager", "fetchObject", "(I)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/reflect/Array", "getLength", "(Ljava/lang/Object;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "_maxSize", "I");
methodVisitor.visitJumpInsn(IF_ICMPLE, label0);
methodVisitor.visitInsn(ACONST_NULL);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "java/lang/Boolean", "FALSE", "Ljava/lang/Boolean;");
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Boolean"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "putData", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Ljava/sql/ResultSet;Lorg/apache/openjpa/jdbc/sql/DBDictionary;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/sql/ResultSet", "getBlob", "(I)Ljava/sql/Blob;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getIndex", "()I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/OpenJPAStateManager", "fetchObject", "(I)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/strats/PrimitiveWrapperArrays", "toByteArray", "(Ljava/lang/Object;)[B", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/sql/DBDictionary", "putBytes", "(Ljava/sql/Blob;[B)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "load", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Result;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/sql/Result", "getBytes", "(Lorg/apache/openjpa/jdbc/schema/Column;Lorg/apache/openjpa/jdbc/sql/Joins;)[B", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/strats/PrimitiveWrapperArrays", "toObjectValue", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;[B)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "map", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("[B"));
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitLdcInsn(Type.getType("[Ljava/lang/Byte;"));
methodVisitor.visitJumpInsn(IF_ACMPEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/MetaDataException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("not-bytes");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/MetaDataException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "map", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getDBDictionary", "()Lorg/apache/openjpa/jdbc/sql/DBDictionary;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/sql/DBDictionary", "maxEmbeddedBlobSize", "I");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "_maxSize", "I");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getValue", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getIndex", "()I", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/OpenJPAStateManager", "fetchObject", "(I)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/jdbc/meta/strats/PrimitiveWrapperArrays", "toByteArray", "(Ljava/lang/Object;)[B", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "_maxSize", "I");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPLE, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getColumns", "()[Lorg/apache/openjpa/jdbc/schema/Column;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/schema/Column", "isNotNull", "()Z", false);
methodVisitor.visitJumpInsn(IFNE, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"[B"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "where", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;Ljava/lang/Object;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "where", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isVersionable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "isVersionable", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "loadProjection", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;Lorg/apache/openjpa/jdbc/sql/Result;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/Object;", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "loadProjection", "(Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;Lorg/apache/openjpa/jdbc/sql/Result;Lorg/apache/openjpa/jdbc/sql/Joins;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "join", "(Lorg/apache/openjpa/jdbc/sql/Joins;Z)Lorg/apache/openjpa/jdbc/sql/Joins;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "join", "(Lorg/apache/openjpa/jdbc/sql/Joins;Z)Lorg/apache/openjpa/jdbc/sql/Joins;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "load", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "load", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "load", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;Lorg/apache/openjpa/jdbc/sql/Result;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "load", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;Lorg/apache/openjpa/jdbc/sql/Result;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "select", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;I)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "select", "(Lorg/apache/openjpa/jdbc/sql/Select;Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;I)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "supportsSelect", "(Lorg/apache/openjpa/jdbc/sql/Select;ILorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "supportsSelect", "(Lorg/apache/openjpa/jdbc/sql/Select;ILorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/kernel/JDBCFetchConfiguration;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "customUpdate", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "customUpdate", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "customInsert", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "customInsert", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "delete", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "delete", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "update", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "update", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "insert", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;)V", null, new String[] { "java/sql/SQLException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "insert", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;Lorg/apache/openjpa/jdbc/sql/RowManager;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isCustomUpdate", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "isCustomUpdate", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "isCustomInsert", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)Ljava/lang/Boolean;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedLobFieldStrategy", "isCustomInsert", "(Lorg/apache/openjpa/kernel/OpenJPAStateManager;Lorg/apache/openjpa/jdbc/kernel/JDBCStore;)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/Localizer", "forPackage", "(Ljava/lang/Class;)Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/jdbc/meta/strats/MaxEmbeddedByteArrayFieldStrategy", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
