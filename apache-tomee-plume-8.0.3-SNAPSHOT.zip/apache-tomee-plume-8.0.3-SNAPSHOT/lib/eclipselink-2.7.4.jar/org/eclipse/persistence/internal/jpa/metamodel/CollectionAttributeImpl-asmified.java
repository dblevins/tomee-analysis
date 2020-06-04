package asm.org.eclipse.persistence.internal.jpa.metamodel;
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
public class CollectionAttributeImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/metamodel/CollectionAttributeImpl", "<X:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl<TX;Ljava/util/Collection<TV;>;TV;>;Ljavax/persistence/metamodel/CollectionAttribute<TX;TV;>;", "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl", new String[] { "javax/persistence/metamodel/CollectionAttribute" });

classWriter.visitInnerClass("javax/persistence/metamodel/PluralAttribute$CollectionType", "javax/persistence/metamodel/PluralAttribute", "CollectionType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(-4981779656175076241L));
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/internal/jpa/metamodel/ManagedTypeImpl;Lorg/eclipse/persistence/mappings/CollectionMapping;)V", "(Lorg/eclipse/persistence/internal/jpa/metamodel/ManagedTypeImpl<TX;>;Lorg/eclipse/persistence/mappings/CollectionMapping;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metamodel/CollectionAttributeImpl", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metamodel/ManagedTypeImpl;Lorg/eclipse/persistence/mappings/CollectionMapping;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/eclipse/persistence/internal/jpa/metamodel/ManagedTypeImpl;Lorg/eclipse/persistence/mappings/CollectionMapping;Z)V", "(Lorg/eclipse/persistence/internal/jpa/metamodel/ManagedTypeImpl<TX;>;Lorg/eclipse/persistence/mappings/CollectionMapping;Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl", "<init>", "(Lorg/eclipse/persistence/internal/jpa/metamodel/ManagedTypeImpl;Lorg/eclipse/persistence/mappings/CollectionMapping;Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCollectionType", "()Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "javax/persistence/metamodel/PluralAttribute$CollectionType", "COLLECTION", "Ljavax/persistence/metamodel/PluralAttribute$CollectionType;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getJavaType", "()Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Collection;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
