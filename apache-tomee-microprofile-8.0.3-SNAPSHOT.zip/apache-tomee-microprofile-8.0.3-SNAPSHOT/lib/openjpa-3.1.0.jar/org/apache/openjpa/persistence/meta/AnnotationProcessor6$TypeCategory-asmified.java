package asm.org.apache.openjpa.persistence.meta;
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
public class AnnotationProcessor6$TypeCategoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "Ljava/lang/Enum<Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "org/apache/openjpa/persistence/meta/AnnotationProcessor6", "TypeCategory", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ATTRIBUTE", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "COLLECTION", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SET", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "LIST", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MAP", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "type", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "$VALUES", "[Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "(Ljava/lang/String;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "type", "Ljava/lang/String;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetaModelType", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "type", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ATTRIBUTE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("jakarta.persistence.metamodel.SingularAttribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "ATTRIBUTE", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("COLLECTION");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("jakarta.persistence.metamodel.CollectionAttribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "COLLECTION", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SET");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("jakarta.persistence.metamodel.SetAttribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "SET", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("LIST");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("jakarta.persistence.metamodel.ListAttribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "LIST", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MAP");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("jakarta.persistence.metamodel.MapAttribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "MAP", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "ATTRIBUTE", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "COLLECTION", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "SET", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "LIST", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "MAP", "Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory", "$VALUES", "[Lorg/apache/openjpa/persistence/meta/AnnotationProcessor6$TypeCategory;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
