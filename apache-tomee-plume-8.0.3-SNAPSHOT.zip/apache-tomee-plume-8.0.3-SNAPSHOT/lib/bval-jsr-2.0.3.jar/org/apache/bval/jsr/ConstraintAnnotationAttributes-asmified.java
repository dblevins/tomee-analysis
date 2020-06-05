package asm.org.apache.bval.jsr;
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
public class ConstraintAnnotationAttributesDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "Ljava/lang/Enum<Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;>;", "java/lang/Enum", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privilizing;", false);
{
AnnotationVisitor annotationVisitor1 = annotationVisitor0.visitArray("value");
{
AnnotationVisitor annotationVisitor2 = annotationVisitor1.visitAnnotation(null, "Lorg/apache/commons/weaver/privilizer/Privilizing$CallTo;");
annotationVisitor2.visit("value", Type.getType("Lorg/apache/bval/util/reflection/Reflection;"));
annotationVisitor2.visitEnd();
}
annotationVisitor1.visitEnd();
}
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Lorg/apache/commons/weaver/privilizer/Privilized;", false);
annotationVisitor0.visit("value", "DYNAMIC");
annotationVisitor0.visitEnd();
}
classWriter.visitInnerClass("org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker", "org/apache/bval/jsr/ConstraintAnnotationAttributes", "Worker", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/bval/jsr/ConstraintAnnotationAttributes$Types", "org/apache/bval/jsr/ConstraintAnnotationAttributes", "Types", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/weaver/privilizer/Privilizing$CallTo", "org/apache/commons/weaver/privilizer/Privilizing", "CallTo", ACC_PUBLIC | ACC_STATIC | ACC_ANNOTATION | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "MESSAGE", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "GROUPS", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "PAYLOAD", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALIDATION_APPLIES_TO", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "VALUE", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MANDATORY", "Ljava/util/Set;", "Ljava/util/Set<Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "attributeName", "Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "validateDefaultValue", "Ljava/util/function/Predicate;", "Ljava/util/function/Predicate<Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "WORKER_CACHE", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/ConcurrentMap<Ljava/lang/Class<*>;Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker<*>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "METHOD_BY_NAME_AND_CLASS", "Ljava/util/concurrent/ConcurrentMap;", "Ljava/util/concurrent/ConcurrentMap<Ljava/lang/Class<*>;Ljava/util/concurrent/ConcurrentMap<Ljava/lang/String;Ljava/lang/reflect/Method;>;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "NULL_METHOD", "Ljava/lang/reflect/Method;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "$VALUES", "[Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/ConstraintAnnotationAttributes");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/function/Predicate;)V", "(Ljava/lang/String;Ljava/util/function/Predicate<Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "attributeName", "Ljava/lang/String;");
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Types;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getDeclaredField", "(Ljava/lang/String;)Ljava/lang/reflect/Field;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/reflect/Field", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "type", "Ljava/lang/Class;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 5, new Object[] {"org/apache/bval/jsr/ConstraintAnnotationAttributes", "java/lang/String", Opcodes.INTEGER, "java/lang/String", "java/util/function/Predicate"}, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitLdcInsn("validateDefaultValue");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Validate", "notNull", "(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/function/Predicate");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "validateDefaultValue", "Ljava/util/function/Predicate;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/Class;", "()Ljava/lang/Class<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "type", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributeName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "attributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "attributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "put", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "<V:Ljava/lang/Object;>(Ljava/util/Map<-Ljava/lang/String;-TV;>;TV;)Ljava/lang/Object;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "get", "(Ljava/util/Map;)Ljava/lang/Object;", "<V:Ljava/lang/Object;>(Ljava/util/Map<-Ljava/lang/String;-TV;>;)TV;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "getType", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/reflection/TypeUtils", "isInstance", "(Ljava/lang/Object;Ljava/lang/reflect/Type;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_NEWINVOKESPECIAL, "java/lang/IllegalStateException", "<init>", "(Ljava/lang/String;)V", false), Type.getType("(Ljava/lang/String;)Ljava/lang/IllegalStateException;")});
methodVisitor.visitLdcInsn("Invalid '%s' value: %s");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Object");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "getAttributeName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/util/Exceptions", "raise", "(Ljava/util/function/Function;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Object"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "analyze", "(Ljava/lang/Class;)Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;", "<C::Ljava/lang/annotation/Annotation;>(Ljava/lang/Class<TC;>;)Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker<TC;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("jakarta.validation.constraint.");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "startsWith", "(Ljava/lang/String;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "WORKER_CACHE", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "(Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;)Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKESPECIAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "lambda$analyze$1", "(Ljava/lang/Class;)Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;", false), Type.getType("(Ljava/lang/Class;)Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;")});
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/concurrent/ConcurrentMap", "computeIfAbsent", "(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker", "<init>", "(Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isMandatory", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "MANDATORY", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isValidDefaultValue", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "validateDefaultValue", "Ljava/util/function/Predicate;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/function/Predicate", "test", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_SYNTHETIC, "lambda$analyze$1", "(Ljava/lang/Class;)Lorg/apache/bval/jsr/ConstraintAnnotationAttributes$Worker;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes$Worker", "<init>", "(Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC | ACC_SYNTHETIC, "lambda$static$0", "(Ljava/lang/Object;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "attributeName", "Ljava/lang/String;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$100", "()Ljava/util/concurrent/ConcurrentMap;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "METHOD_BY_NAME_AND_CLASS", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$200", "()Ljava/lang/reflect/Method;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "NULL_METHOD", "Ljava/lang/reflect/Method;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "type", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "__privileged_clinit0", "()V", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/NoSuchMethodException");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintAnnotationAttributes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("MESSAGE");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("message");
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "lambda$static$0", "(Ljava/lang/Object;)Z", false), Type.getType("(Ljava/lang/Object;)Z")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/function/Predicate;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "MESSAGE", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintAnnotationAttributes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("GROUPS");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("groups");
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/util/ObjectUtils", "isEmptyArray", "(Ljava/lang/Object;)Z", false), Type.getType("(Ljava/lang/Object;)Z")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/function/Predicate;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "GROUPS", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintAnnotationAttributes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("PAYLOAD");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("payload");
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/util/ObjectUtils", "isEmptyArray", "(Ljava/lang/Object;)Z", false), Type.getType("(Ljava/lang/Object;)Z")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/function/Predicate;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "PAYLOAD", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintAnnotationAttributes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALIDATION_APPLIES_TO");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("validationAppliesTo");
methodVisitor.visitFieldInsn(GETSTATIC, "jakarta/validation/ConstraintTarget", "IMPLICIT", "Ljakarta/validation/ConstraintTarget;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/function/Predicate", "isEqual", "(Ljava/lang/Object;)Ljava/util/function/Predicate;", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/function/Predicate;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "VALIDATION_APPLIES_TO", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/ConstraintAnnotationAttributes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("VALUE");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("value");
methodVisitor.visitInvokeDynamicInsn("test", "()Ljava/util/function/Predicate;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Z"), new Handle(Opcodes.H_INVOKESTATIC, "org/apache/bval/util/ObjectUtils", "isEmptyArray", "(Ljava/lang/Object;)Z", false), Type.getType("(Ljava/lang/Object;)Z")});
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/function/Predicate;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "VALUE", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/bval/jsr/ConstraintAnnotationAttributes");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "MESSAGE", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "GROUPS", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "PAYLOAD", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "VALIDATION_APPLIES_TO", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "VALUE", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "$VALUES", "[Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "MESSAGE", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "GROUPS", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "PAYLOAD", "Lorg/apache/bval/jsr/ConstraintAnnotationAttributes;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/EnumSet", "of", "(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableSet", "(Ljava/util/Set;)Ljava/util/Set;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "MANDATORY", "Ljava/util/Set;");
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "WORKER_CACHE", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitTypeInsn(NEW, "java/util/concurrent/ConcurrentHashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/concurrent/ConcurrentHashMap", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "METHOD_BY_NAME_AND_CLASS", "Ljava/util/concurrent/ConcurrentMap;");
methodVisitor.visitLabel(label0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Object;"));
methodVisitor.visitLdcInsn("hashCode");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getMethod", "(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "NULL_METHOD", "Ljava/lang/reflect/Method;");
methodVisitor.visitLabel(label1);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/NoSuchMethodException"});
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitTypeInsn(NEW, "java/lang/RuntimeException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Impossible normally");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/RuntimeException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/ConstraintAnnotationAttributes", "__privileged_clinit0", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(0, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
