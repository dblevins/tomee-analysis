package asm.org.apache.xbean.recipe;
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
public class ParameterNameLoaderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/xbean/recipe/ParameterNameLoader", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/reflect/Method;)Ljava/util/List;", "(Ljava/lang/reflect/Method;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/reflect/Constructor;)Ljava/util/List;", "(Ljava/lang/reflect/Constructor;)Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
