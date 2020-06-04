package asm.org.apache.johnzon.jsonb.factory;
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
public class CdiJohnzonAdapterFactoryDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", null, "org/apache/johnzon/jsonb/factory/SimpleJohnzonAdapterFactory", null);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "CdiInstance", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$Instance", "org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory", "Instance", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$ConstantInstance", "org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory", "ConstantInstance", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "bm", "Ljavax/enterprise/inject/spi/BeanManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/factory/SimpleJohnzonAdapterFactory", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljavax/enterprise/inject/spi/BeanManager;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "cast", "(Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/enterprise/inject/spi/BeanManager");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "bm", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "create", "(Ljava/lang/Class;)Lorg/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$Instance;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lorg/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$Instance<TT;>;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitTryCatchBlock(label3, label4, label2, "java/lang/Exception");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "bm", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getBeans", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;)Ljava/util/Set;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "bm", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "resolve", "(Ljava/util/Set;)Ljavax/enterprise/inject/spi/Bean;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "bm", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "createCreationalContext", "(Ljavax/enterprise/context/spi/Contextual;)Ljavax/enterprise/context/spi/CreationalContext;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "bm", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getReference", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "bm", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/Bean", "getScope", "()Ljava/lang/Class;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "isNormalScope", "(Ljava/lang/Class;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$ConstantInstance");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "bm", "Ljavax/enterprise/inject/spi/BeanManager;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/enterprise/inject/spi/BeanManager", "getReference", "(Ljavax/enterprise/inject/spi/Bean;Ljava/lang/reflect/Type;Ljavax/enterprise/context/spi/CreationalContext;)Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$ConstantInstance", "<init>", "(Ljava/lang/Object;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 6, new Object[] {"org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "java/lang/Class", "java/util/Set", "javax/enterprise/inject/spi/Bean", "javax/enterprise/context/spi/CreationalContext", "java/lang/Object"}, 0, new Object[] {});
methodVisitor.visitTypeInsn(NEW, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$CdiInstance", "<init>", "(Ljava/lang/Object;Ljavax/enterprise/context/spi/CreationalContext;Lorg/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory$1;)V", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_FULL, 2, new Object[] {"org/apache/johnzon/jsonb/factory/CdiJohnzonAdapterFactory", "java/lang/Class"}, 0, new Object[] {});
Label label6 = new Label();
methodVisitor.visitJumpInsn(GOTO, label6);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/factory/SimpleJohnzonAdapterFactory", "create", "(Ljava/lang/Class;)Lorg/apache/johnzon/jsonb/spi/JohnzonAdapterFactory$Instance;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
