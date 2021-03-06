package asm.org.apache.myfaces.cdi.validator;
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
public class FacesValidatorProducerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/myfaces/cdi/validator/FacesValidatorProducer", "Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer<Ljakarta/faces/validator/Validator;>;", "org/apache/myfaces/cdi/util/AbstractDynamicProducer", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljakarta/enterprise/inject/Typed;", true);
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljakarta/enterprise/inject/spi/BeanManager;Lorg/apache/myfaces/cdi/validator/FacesValidatorInfo;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "<init>", "(Ljakarta/enterprise/inject/spi/BeanManager;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "getValidatorId", "()Ljava/lang/String;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 3, new Object[] {"org/apache/myfaces/cdi/validator/FacesValidatorProducer", "jakarta/enterprise/inject/spi/BeanManager", "org/apache/myfaces/cdi/validator/FacesValidatorInfo"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "getValidatorId", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/Object;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitLdcInsn("_");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label2 = new Label();
methodVisitor.visitLabel(label2);
methodVisitor.visitTypeInsn(NEW, "org/apache/myfaces/cdi/validator/FacesValidatorAnnotationLiteral");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "getValidatorId", "()Ljava/lang/String;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitLdcInsn("");
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/myfaces/cdi/validator/FacesValidatorProducer", "jakarta/enterprise/inject/spi/BeanManager", "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "java/lang/String", "java/lang/String"}, 2, new Object[] {label2, label2});
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "getValidatorId", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/myfaces/cdi/validator/FacesValidatorProducer", "jakarta/enterprise/inject/spi/BeanManager", "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "java/lang/String", "java/lang/String"}, 3, new Object[] {label2, label2, "java/lang/String"});
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/cdi/validator/FacesValidatorAnnotationLiteral", "<init>", "(Ljava/lang/String;ZZ)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "id", "(Ljava/lang/String;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitLdcInsn(Type.getType("Ljakarta/enterprise/context/Dependent;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "scope", "(Ljava/lang/Class;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/annotation/Annotation");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "qualifiers", "([Ljava/lang/annotation/Annotation;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/reflect/Type");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "types", "([Ljava/lang/reflect/Type;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorInfo", "getType", "()Ljava/lang/reflect/Type;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/reflect/Type", "getTypeName", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/shared/util/ClassUtils", "simpleClassForName", "(Ljava/lang/String;)Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "beanClass", "(Ljava/lang/Class;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/myfaces/cdi/validator/FacesValidatorProducer;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/myfaces/cdi/validator/FacesValidatorProducer", "lambda$new$0", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljakarta/faces/validator/Validator;", false), Type.getType("(Ljakarta/enterprise/context/spi/CreationalContext;)Ljakarta/faces/validator/Validator;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/util/AbstractDynamicProducer", "create", "(Ljava/util/function/Function;)Lorg/apache/myfaces/cdi/util/AbstractDynamicProducer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "createValidator", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljakarta/faces/validator/Validator;", "(Ljakarta/enterprise/context/spi/CreationalContext<Ljakarta/faces/validator/Validator;>;)Ljakarta/faces/validator/Validator;", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorProducer", "getBeanClass", "()Ljava/lang/Class;", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "newInstance", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "jakarta/faces/validator/Validator");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/myfaces/cdi/validator/FacesValidatorProducer", "jakarta/enterprise/context/spi/CreationalContext", "java/lang/Class", "jakarta/faces/validator/Validator"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/cdi/validator/FacesValidatorProducer;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/logging/Logger", "getLogger", "(Ljava/lang/String;)Ljava/util/logging/Logger;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "java/util/logging/Level", "SEVERE", "Ljava/util/logging/Level;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not instantiate converter ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/logging/Logger", "log", "(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitTypeInsn(NEW, "jakarta/faces/FacesException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Could not instantiate converter: ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/faces/FacesException", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$new$0", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljakarta/faces/validator/Validator;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/myfaces/cdi/validator/FacesValidatorProducer", "createValidator", "(Ljakarta/enterprise/context/spi/CreationalContext;)Ljakarta/faces/validator/Validator;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
