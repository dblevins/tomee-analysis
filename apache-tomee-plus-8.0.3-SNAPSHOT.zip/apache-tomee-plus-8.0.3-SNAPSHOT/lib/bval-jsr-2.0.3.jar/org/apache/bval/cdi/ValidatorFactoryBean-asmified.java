package asm.org.apache.bval.cdi;
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
public class ValidatorFactoryBeanDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/bval/cdi/ValidatorFactoryBean", "Ljava/lang/Object;Ljakarta/enterprise/inject/spi/Bean<Ljakarta/validation/ValidatorFactory;>;Ljakarta/enterprise/inject/spi/PassivationCapable;", "java/lang/Object", new String[] { "jakarta/enterprise/inject/spi/Bean", "jakarta/enterprise/inject/spi/PassivationCapable" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "types", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/reflect/Type;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "qualifiers", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "instance", "Ljava/util/function/Supplier;", "Ljava/util/function/Supplier<Ljakarta/validation/ValidatorFactory;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/util/function/Supplier;)V", "(Ljava/util/function/Supplier<Ljakarta/validation/ValidatorFactory;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/cdi/ValidatorFactoryBean", "instance", "Ljava/util/function/Supplier;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/validation/ValidatorFactory;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableSet", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/cdi/ValidatorFactoryBean", "types", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/cdi/DefaultLiteral", "INSTANCE", "Lorg/apache/bval/cdi/DefaultLiteral;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/cdi/AnyLiteral", "INSTANCE", "Lorg/apache/bval/cdi/AnyLiteral;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableSet", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/cdi/ValidatorFactoryBean", "qualifiers", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTypes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/reflect/Type;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/cdi/ValidatorFactoryBean", "types", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQualifiers", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/cdi/ValidatorFactoryBean", "qualifiers", "Ljava/util/Set;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScope", "()Ljava/lang/Class;", "()Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/ApplicationScoped;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isNullable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInjectionPoints", "()Ljava/util/Set;", "()Ljava/util/Set<Ljakarta/enterprise/inject/spi/InjectionPoint;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBeanClass", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/validation/ValidatorFactory;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStereotypes", "()Ljava/util/Set;", "()Ljava/util/Set<Ljava/lang/Class<+Ljava/lang/annotation/Annotation;>;>;", null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAlternative", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljakarta/validation/ValidatorFactory;", "(Ljakarta/enterprise/context/spi/CreationalContext<Ljakarta/validation/ValidatorFactory;>;)Ljakarta/validation/ValidatorFactory;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/cdi/ValidatorFactoryBean", "instance", "Ljava/util/function/Supplier;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Supplier", "get", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/validation/ValidatorFactory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "destroy", "(Ljakarta/validation/ValidatorFactory;Ljakarta/enterprise/context/spi/CreationalContext;)V", "(Ljakarta/validation/ValidatorFactory;Ljakarta/enterprise/context/spi/CreationalContext<Ljakarta/validation/ValidatorFactory;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/validation/ValidatorFactory", "close", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getId", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("BVal%s-%d");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/validation/ValidatorFactory;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getSimpleName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "hashCode", "()I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "destroy", "(Ljava/lang/Object;Ljakarta/enterprise/context/spi/CreationalContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/validation/ValidatorFactory");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/cdi/ValidatorFactoryBean", "destroy", "(Ljakarta/validation/ValidatorFactory;Ljakarta/enterprise/context/spi/CreationalContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "create", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/cdi/ValidatorFactoryBean", "create", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljakarta/validation/ValidatorFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
