package asm.org.apache.openjpa.kernel;
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
public class FinderCacheDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/kernel/FinderCache", "<K:Ljava/lang/Object;V:Ljava/lang/Object;R:Ljava/lang/Object;>Ljava/lang/Object;Lorg/apache/openjpa/lib/conf/Configurable;", "java/lang/Object", new String[] { "org/apache/openjpa/lib/conf/Configurable" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "get", "(Ljava/lang/Object;Lorg/apache/openjpa/kernel/FetchConfiguration;)Lorg/apache/openjpa/kernel/FinderQuery;", "(TK;Lorg/apache/openjpa/kernel/FetchConfiguration;)Lorg/apache/openjpa/kernel/FinderQuery<TK;TV;TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "cache", "(Ljava/lang/Object;Ljava/lang/Object;Lorg/apache/openjpa/kernel/FetchConfiguration;)Lorg/apache/openjpa/kernel/FinderQuery;", "(TK;TV;Lorg/apache/openjpa/kernel/FetchConfiguration;)Lorg/apache/openjpa/kernel/FinderQuery<TK;TV;TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getMapView", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "invalidate", "(Ljava/lang/Object;)Z", "(TK;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "markUncachable", "(Ljava/lang/Object;)Lorg/apache/openjpa/kernel/FinderQuery;", "(TK;)Lorg/apache/openjpa/kernel/FinderQuery<TK;TV;TR;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isExcluded", "(Ljava/lang/Object;)Z", "(TK;)Z", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getExcludes", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "addExclusionPattern", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "removeExclusionPattern", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getStatistics", "()Lorg/apache/openjpa/kernel/QueryStatistics;", "()Lorg/apache/openjpa/kernel/QueryStatistics<TK;>;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
