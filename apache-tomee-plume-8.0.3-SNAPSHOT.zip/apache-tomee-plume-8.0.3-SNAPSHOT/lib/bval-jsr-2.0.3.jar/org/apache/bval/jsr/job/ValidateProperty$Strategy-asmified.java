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
public class ValidateProperty$StrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/apache/bval/jsr/job/ValidateProperty$Strategy", "<T:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/bval/jsr/util/PathImpl$Builder", "org/apache/bval/jsr/util/PathImpl", "Builder", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$FindDescriptor", "org/apache/bval/jsr/job/ValidateProperty", "FindDescriptor", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/bval/jsr/util/PathNavigation$Callback", "org/apache/bval/jsr/util/PathNavigation", "Callback", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidationJob$Frame", "org/apache/bval/jsr/job/ValidationJob", "Frame", ACC_PUBLIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/bval/jsr/job/ValidateProperty$Strategy", "org/apache/bval/jsr/job/ValidateProperty", "Strategy", ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRootBean", "()Ljava/lang/Object;", "()TT;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "callback", "(Lorg/apache/bval/jsr/util/PathImpl$Builder;Lorg/apache/bval/jsr/job/ValidateProperty$FindDescriptor;Lorg/apache/bval/util/ObjectWrapper;)Lorg/apache/bval/jsr/util/PathNavigation$Callback;", "(Lorg/apache/bval/jsr/util/PathImpl$Builder;Lorg/apache/bval/jsr/job/ValidateProperty$FindDescriptor;Lorg/apache/bval/util/ObjectWrapper<Ljava/lang/Boolean;>;)Lorg/apache/bval/jsr/util/PathNavigation$Callback<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "frame", "(Lorg/apache/bval/jsr/job/ValidateProperty;Lorg/apache/bval/jsr/util/PathImpl;)Lorg/apache/bval/jsr/job/ValidationJob$Frame;", "(Lorg/apache/bval/jsr/job/ValidateProperty<TT;>;Lorg/apache/bval/jsr/util/PathImpl;)Lorg/apache/bval/jsr/job/ValidationJob<TT;>.Frame<*>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
