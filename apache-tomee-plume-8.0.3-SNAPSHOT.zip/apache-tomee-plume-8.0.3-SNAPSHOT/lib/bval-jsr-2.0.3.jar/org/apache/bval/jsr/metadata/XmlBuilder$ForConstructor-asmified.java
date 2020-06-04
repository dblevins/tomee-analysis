package asm.org.apache.bval.jsr.metadata;
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
public class XmlBuilder$ForConstructorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "<T:Ljava/lang/Object;>Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable<Lorg/apache/bval/jsr/metadata/XmlBuilder$ForConstructor<TT;>;Ljava/lang/reflect/Constructor<+TT;>;Lorg/apache/bval/jsr/xml/ConstructorType;>;", "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", null);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "org/apache/bval/jsr/metadata/XmlBuilder", "ForConstructor", ACC_PRIVATE);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "org/apache/bval/jsr/metadata/XmlBuilder", "ForExecutable", ACC_PRIVATE | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/metadata/XmlBuilder$NonRootLevel", "org/apache/bval/jsr/metadata/XmlBuilder", "NonRootLevel", ACC_PRIVATE);

classWriter.visitInnerClass("java/lang/invoke/MethodHandles$Lookup", "java/lang/invoke/MethodHandles", "Lookup", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Lorg/apache/bval/jsr/xml/ConstructorType;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "this$0", "Lorg/apache/bval/jsr/metadata/XmlBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForExecutable", "<init>", "(Lorg/apache/bval/jsr/metadata/XmlBuilder;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/xml/ConstructorType", "getIgnoreAnnotations", "()Ljava/lang/Boolean;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ConstructorType;)Ljava/lang/Boolean;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "withGetIgnoreAnnotations", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/metadata/XmlBuilder$NonRootLevel;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor");
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/xml/ConstructorType", "getReturnValue", "()Lorg/apache/bval/jsr/xml/ReturnValueType;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ConstructorType;)Lorg/apache/bval/jsr/xml/ReturnValueType;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "withGetReturnValue", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor");
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/xml/ConstructorType", "getCrossParameter", "()Lorg/apache/bval/jsr/xml/CrossParameterType;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ConstructorType;)Lorg/apache/bval/jsr/xml/CrossParameterType;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "withGetCrossParameter", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor");
methodVisitor.visitInvokeDynamicInsn("apply", "()Ljava/util/function/Function;", new Handle(Opcodes.H_INVOKESTATIC, "java/lang/invoke/LambdaMetafactory", "metafactory", "(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodType;Ljava/lang/invoke/MethodHandle;Ljava/lang/invoke/MethodType;)Ljava/lang/invoke/CallSite;", false), new Object[]{Type.getType("(Ljava/lang/Object;)Ljava/lang/Object;"), new Handle(Opcodes.H_INVOKEVIRTUAL, "org/apache/bval/jsr/xml/ConstructorType", "getParameter", "()Ljava/util/List;", false), Type.getType("(Lorg/apache/bval/jsr/xml/ConstructorType;)Ljava/util/List;")});
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/bval/jsr/metadata/XmlBuilder$ForConstructor", "withGetParameters", "(Ljava/util/function/Function;)Lorg/apache/bval/jsr/metadata/XmlBuilder$ForExecutable;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
