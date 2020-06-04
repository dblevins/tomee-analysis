package asm.org.apache.bval.jsr.job;
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
public class ValidateProperty$ForPropertyValueDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/bval/jsr/job/ValidateProperty$ForPropertyValue", "<T:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/bval/jsr/job/ValidateProperty$Strategy<TT;>;", "java/lang/Object", new String[] { "org/apache/bval/jsr/job/ValidateProperty$Strategy" });

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$ForPropertyValue", "org/apache/bval/jsr/job/ValidateProperty", "ForPropertyValue", ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/util/PathImpl$Builder", "org/apache/bval/jsr/util/PathImpl", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$FindDescriptor", "org/apache/bval/jsr/job/ValidateProperty", "FindDescriptor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/util/PathNavigation$Callback", "org/apache/bval/jsr/util/PathNavigation", "Callback", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$Frame", "org/apache/bval/jsr/job/ValidationJob", "Frame", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$Strategy", "org/apache/bval/jsr/job/ValidateProperty", "Strategy", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$WalkGraph", "org/apache/bval/jsr/job/ValidateProperty", "WalkGraph", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$LeafFrame", "org/apache/bval/jsr/job/ValidateProperty", "LeafFrame", 0);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$PropertyFrame", "org/apache/bval/jsr/job/ValidateProperty", "PropertyFrame", 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL, "validatorContext", "Lorg/apache/bval/jsr/ApacheFactoryContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "rootBeanClass", "Ljava/lang/Class;", "Ljava/lang/Class<*>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL, "value", "Ljava/lang/Object;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;Ljava/lang/Class;Ljava/lang/Object;)V", "(Lorg/apache/bval/jsr/ApacheFactoryContext;Ljava/lang/Class<*>;Ljava/lang/Object;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateProperty$ForPropertyValue", "validatorContext", "Lorg/apache/bval/jsr/ApacheFactoryContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateProperty$ForPropertyValue", "rootBeanClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/bval/jsr/job/ValidateProperty$ForPropertyValue", "value", "Ljava/lang/Object;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRootBean", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "callback", "(Lorg/apache/bval/jsr/util/PathImpl$Builder;Lorg/apache/bval/jsr/job/ValidateProperty$FindDescriptor;Lorg/apache/bval/util/ObjectWrapper;)Lorg/apache/bval/jsr/util/PathNavigation$Callback;", "(Lorg/apache/bval/jsr/util/PathImpl$Builder;Lorg/apache/bval/jsr/job/ValidateProperty$FindDescriptor;Lorg/apache/bval/util/ObjectWrapper<Ljava/lang/Boolean;>;)Lorg/apache/bval/jsr/util/PathNavigation$Callback<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/job/ValidateProperty$WalkGraph");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateProperty$ForPropertyValue", "validatorContext", "Lorg/apache/bval/jsr/ApacheFactoryContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateProperty$ForPropertyValue", "rootBeanClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/util/ObjectWrapper");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/util/ObjectWrapper", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateProperty$WalkGraph", "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;Ljava/lang/Class;Lorg/apache/bval/jsr/util/PathImpl$Builder;Lorg/apache/bval/jsr/job/ValidateProperty$FindDescriptor;Lorg/apache/bval/util/ObjectWrapper;Lorg/apache/bval/util/ObjectWrapper;Ljava/util/function/BiConsumer;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "frame", "(Lorg/apache/bval/jsr/job/ValidateProperty;Lorg/apache/bval/jsr/util/PathImpl;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", "(Lorg/apache/bval/jsr/job/ValidateProperty<TT;>;Lorg/apache/bval/jsr/util/PathImpl;)Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<*>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/GraphContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateProperty", "validatorContext", "Lorg/apache/bval/jsr/ApacheFactoryContext;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/bval/jsr/job/ValidateProperty$ForPropertyValue", "value", "Ljava/lang/Object;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/GraphContext", "<init>", "(Lorg/apache/bval/jsr/ApacheFactoryContext;Lorg/apache/bval/jsr/util/PathImpl;Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/job/ValidateProperty", "access$000", "(Lorg/apache/bval/jsr/job/ValidateProperty;)Lorg/apache/bval/jsr/descriptor/ElementD;", false);
methodVisitor.visitTypeInsn(INSTANCEOF, "javax/validation/metadata/BeanDescriptor");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/job/ValidateProperty$LeafFrame");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateProperty$LeafFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidateProperty;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/bval/jsr/GraphContext"}, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/bval/jsr/job/ValidateProperty$PropertyFrame");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/bval/jsr/job/ValidateProperty", "access$000", "(Lorg/apache/bval/jsr/job/ValidateProperty;)Lorg/apache/bval/jsr/descriptor/ElementD;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/bval/jsr/descriptor/PropertyD");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/bval/jsr/job/ValidateProperty$PropertyFrame", "<init>", "(Lorg/apache/bval/jsr/job/ValidateProperty;Lorg/apache/bval/jsr/job/ValidationJob$Frame;Lorg/apache/bval/jsr/descriptor/ElementD;Lorg/apache/bval/jsr/GraphContext;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
