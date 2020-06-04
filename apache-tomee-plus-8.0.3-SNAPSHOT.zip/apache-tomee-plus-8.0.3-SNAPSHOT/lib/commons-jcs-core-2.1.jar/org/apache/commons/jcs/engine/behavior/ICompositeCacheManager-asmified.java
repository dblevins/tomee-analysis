package asm.org.apache.commons.jcs.engine.behavior;
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
public class ICompositeCacheManagerDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/commons/jcs/engine/behavior/ICompositeCacheManager", null, "java/lang/Object", new String[] { "org/apache/commons/jcs/engine/behavior/IShutdownObservable" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCache", "(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;)Lorg/apache/commons/jcs/engine/control/CompositeCache<TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAuxiliaryCache", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/commons/jcs/auxiliary/AuxiliaryCache;", "<K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/commons/jcs/auxiliary/AuxiliaryCache<TK;TV;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getConfigurationProperties", "()Ljava/util/Properties;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStats", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
