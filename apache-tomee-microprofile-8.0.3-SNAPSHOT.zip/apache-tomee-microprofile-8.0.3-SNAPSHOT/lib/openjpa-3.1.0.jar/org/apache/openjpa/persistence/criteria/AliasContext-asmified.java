package asm.org.apache.openjpa.persistence.criteria;
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
public class AliasContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/persistence/criteria/AliasContext", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAlias", "(Ljakarta/persistence/criteria/Selection;)Ljava/lang/String;", "(Ljakarta/persistence/criteria/Selection<*>;)Ljava/lang/String;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "registerVariable", "(Ljakarta/persistence/criteria/Selection;Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)V", "(Ljakarta/persistence/criteria/Selection<*>;Lorg/apache/openjpa/kernel/exps/Value;Lorg/apache/openjpa/kernel/exps/Value;)V", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isRegistered", "(Ljakarta/persistence/criteria/Selection;)Z", "(Ljakarta/persistence/criteria/Selection<*>;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRegisteredVariable", "(Ljakarta/persistence/criteria/Selection;)Lorg/apache/openjpa/kernel/exps/Value;", "(Ljakarta/persistence/criteria/Selection<*>;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRegisteredRootVariable", "(Ljakarta/persistence/criteria/Root;)Lorg/apache/openjpa/kernel/exps/Value;", "(Ljakarta/persistence/criteria/Root<*>;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRegisteredValue", "(Ljakarta/persistence/criteria/Selection;)Lorg/apache/openjpa/kernel/exps/Value;", "(Ljakarta/persistence/criteria/Selection<*>;)Lorg/apache/openjpa/kernel/exps/Value;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
