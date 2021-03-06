package asm.io.opentracing.propagation;
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
public class FormatDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "io/opentracing/propagation/Format", "<C:Ljava/lang/Object;>Ljava/lang/Object;", "java/lang/Object", null);

classWriter.visitInnerClass("io/opentracing/propagation/Format$Builtin", "io/opentracing/propagation/Format", "Builtin", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

classWriter.visitEnd();

return classWriter.toByteArray();
}
}
