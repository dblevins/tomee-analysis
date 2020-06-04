package asm.org.apache.openejb.assembler.classic;
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
public class JndiBuilder$JndiNameStrategyDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy", "org/apache/openejb/assembler/classic/JndiBuilder", "JndiNameStrategy", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface", "org/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy", "Interface", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "begin", "(Lorg/apache/openejb/BeanContext;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getName", "(Ljava/lang/Class;Ljava/lang/String;Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getNames", "(Ljava/lang/Class;Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;)Ljava/util/Map;", "(Ljava/lang/Class;Lorg/apache/openejb/assembler/classic/JndiBuilder$JndiNameStrategy$Interface;)Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "end", "()V", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
