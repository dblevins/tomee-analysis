package asm.org.apache.openjpa.jdbc.meta;
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
public class FieldMappingInfo$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$2", null, "java/lang/Object", new String[] { "org/apache/openjpa/jdbc/meta/MappingInfo$ForeignKeyDefaults" });

classWriter.visitOuterClass("org/apache/openjpa/jdbc/meta/FieldMappingInfo", "getJoin", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;ZLjava/util/List;)Lorg/apache/openjpa/jdbc/schema/ForeignKey;");

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/FieldMappingInfo$2", null, null, 0);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/MappingInfo$ForeignKeyDefaults", "org/apache/openjpa/jdbc/meta/MappingInfo", "ForeignKeyDefaults", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/meta/FieldMappingInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/jdbc/meta/FieldMappingInfo;Lorg/apache/openjpa/jdbc/meta/FieldMapping;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$2", "this$0", "Lorg/apache/openjpa/jdbc/meta/FieldMappingInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$2", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Z)Lorg/apache/openjpa/jdbc/schema/ForeignKey;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$2", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getMappingDefaults", "()Lorg/apache/openjpa/jdbc/meta/MappingDefaults;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$2", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/MappingDefaults", "getJoinForeignKey", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;)Lorg/apache/openjpa/jdbc/schema/ForeignKey;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "populate", "(Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;ZII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$2", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/FieldMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getMappingDefaults", "()Lorg/apache/openjpa/jdbc/meta/MappingDefaults;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/FieldMappingInfo$2", "val$field", "Lorg/apache/openjpa/jdbc/meta/FieldMapping;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/MappingDefaults", "populateJoinColumn", "(Lorg/apache/openjpa/jdbc/meta/FieldMapping;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;II)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
