package asm.org.eclipse.persistence.internal.jpa.metamodel.proxy;
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
public class PluralAttributeProxyImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/eclipse/persistence/internal/jpa/metamodel/proxy/PluralAttributeProxyImpl", "<X:Ljava/lang/Object;C:Ljava/lang/Object;V:Ljava/lang/Object;>Lorg/eclipse/persistence/internal/jpa/metamodel/proxy/AttributeProxyImpl<TX;TC;>;Ljavax/persistence/metamodel/PluralAttribute<TX;TC;TV;>;", "org/eclipse/persistence/internal/jpa/metamodel/proxy/AttributeProxyImpl", new String[] { "javax/persistence/metamodel/PluralAttribute" });

classWriter.visitInnerClass("javax/persistence/metamodel/Bindable$BindableType", "javax/persistence/metamodel/Bindable", "BindableType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("javax/persistence/metamodel/PluralAttribute$CollectionType", "javax/persistence/metamodel/PluralAttribute", "CollectionType", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/jpa/metamodel/proxy/AttributeProxyImpl", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBindableType", "()Ljavax/persistence/metamodel/Bindable$BindableType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metamodel/proxy/PluralAttributeProxyImpl", "getAttribute", "()Ljavax/persistence/metamodel/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl", "getBindableType", "()Ljavax/persistence/metamodel/Bindable$BindableType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBindableJavaType", "()Ljava/lang/Class;", "()Ljava/lang/Class<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metamodel/proxy/PluralAttributeProxyImpl", "getAttribute", "()Ljavax/persistence/metamodel/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl", "getBindableJavaType", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCollectionType", "()Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metamodel/proxy/PluralAttributeProxyImpl", "getAttribute", "()Ljavax/persistence/metamodel/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl", "getCollectionType", "()Ljavax/persistence/metamodel/PluralAttribute$CollectionType;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getElementType", "()Ljavax/persistence/metamodel/Type;", "()Ljavax/persistence/metamodel/Type<TV;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metamodel/proxy/PluralAttributeProxyImpl", "getAttribute", "()Ljavax/persistence/metamodel/Attribute;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/jpa/metamodel/PluralAttributeImpl", "getElementType", "()Ljavax/persistence/metamodel/Type;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
