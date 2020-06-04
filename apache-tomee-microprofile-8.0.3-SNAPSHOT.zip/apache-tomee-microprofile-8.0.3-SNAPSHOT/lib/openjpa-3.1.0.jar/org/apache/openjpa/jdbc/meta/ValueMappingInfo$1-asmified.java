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
public class ValueMappingInfo$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", null, "java/lang/Object", new String[] { "org/apache/openjpa/jdbc/meta/MappingInfo$ForeignKeyDefaults" });

classWriter.visitOuterClass("org/apache/openjpa/jdbc/meta/ValueMappingInfo", "getTypeJoin", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;ZZ)Lorg/apache/openjpa/jdbc/schema/ForeignKey;");

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openjpa/jdbc/meta/MappingInfo$ForeignKeyDefaults", "org/apache/openjpa/jdbc/meta/MappingInfo", "ForeignKeyDefaults", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$val", "Lorg/apache/openjpa/jdbc/meta/ValueMapping;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$name", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openjpa/jdbc/meta/ValueMappingInfo;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openjpa/jdbc/meta/ValueMappingInfo;Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "this$0", "Lorg/apache/openjpa/jdbc/meta/ValueMappingInfo;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "val$val", "Lorg/apache/openjpa/jdbc/meta/ValueMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "val$name", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Z)Lorg/apache/openjpa/jdbc/schema/ForeignKey;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "val$val", "Lorg/apache/openjpa/jdbc/meta/ValueMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/ValueMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getMappingDefaults", "()Lorg/apache/openjpa/jdbc/meta/MappingDefaults;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "val$val", "Lorg/apache/openjpa/jdbc/meta/ValueMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "val$name", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/MappingDefaults", "getForeignKey", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Z)Lorg/apache/openjpa/jdbc/schema/ForeignKey;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "populate", "(Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;ZII)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "val$val", "Lorg/apache/openjpa/jdbc/meta/ValueMapping;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/ValueMapping", "getMappingRepository", "()Lorg/apache/openjpa/jdbc/meta/MappingRepository;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/jdbc/meta/MappingRepository", "getMappingDefaults", "()Lorg/apache/openjpa/jdbc/meta/MappingDefaults;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "val$val", "Lorg/apache/openjpa/jdbc/meta/ValueMapping;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/jdbc/meta/ValueMappingInfo$1", "val$name", "Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/jdbc/meta/MappingDefaults", "populateForeignKeyColumn", "(Lorg/apache/openjpa/jdbc/meta/ValueMapping;Lorg/apache/openjpa/jdbc/identifier/DBIdentifier;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Table;Lorg/apache/openjpa/jdbc/schema/Column;Ljava/lang/Object;ZII)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(10, 8);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
