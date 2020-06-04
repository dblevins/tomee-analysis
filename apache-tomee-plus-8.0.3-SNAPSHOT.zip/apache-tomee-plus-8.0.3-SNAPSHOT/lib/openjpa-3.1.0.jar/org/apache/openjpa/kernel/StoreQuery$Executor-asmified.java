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
public class StoreQuery$ExecutorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/kernel/StoreQuery$Executor", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openjpa/kernel/StoreQuery$Range", "org/apache/openjpa/kernel/StoreQuery", "Range", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/kernel/StoreQuery$Executor", "org/apache/openjpa/kernel/StoreQuery", "Executor", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeQuery", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)Lorg/apache/openjpa/lib/rop/ResultObjectProvider;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeDelete", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;)Ljava/lang/Number;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "executeUpdate", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;)Ljava/lang/Number;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getDataStoreActions", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)[Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "validate", "(Lorg/apache/openjpa/kernel/StoreQuery;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getRange", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Lorg/apache/openjpa/kernel/StoreQuery$Range;)V", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOrderingValue", "(Lorg/apache/openjpa/kernel/StoreQuery;[Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAscending", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isPacking", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAlias", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProjectionAliases", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getProjectionTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Ljava/lang/Class;", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Ljava/lang/Class<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getAccessPathMetaDatas", "(Lorg/apache/openjpa/kernel/StoreQuery;)[Lorg/apache/openjpa/meta/ClassMetaData;", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOperation", "(Lorg/apache/openjpa/kernel/StoreQuery;)I", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isAggregate", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "isDistinct", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "hasGrouping", "(Lorg/apache/openjpa/kernel/StoreQuery;)Z", null, null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getOrderedParameterTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/lib/util/OrderedMap;", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/lib/util/OrderedMap<Ljava/lang/Object;Ljava/lang/Class<*>;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT | ACC_DEPRECATED, "getParameterTypes", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/commons/collections4/map/LinkedMap;", null, null);
{
annotationVisitor0 = methodVisitor.visitAnnotation("Ljava/lang/Deprecated;", true);
annotationVisitor0.visitEnd();
}
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "toParameterArray", "(Lorg/apache/openjpa/kernel/StoreQuery;Ljava/util/Map;)[Ljava/lang/Object;", "(Lorg/apache/openjpa/kernel/StoreQuery;Ljava/util/Map<**>;)[Ljava/lang/Object;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResultClass", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/lang/Class;", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/lang/Class<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getResultShape", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/ResultShape;", "(Lorg/apache/openjpa/kernel/StoreQuery;)Lorg/apache/openjpa/kernel/ResultShape<*>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getUpdates", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/util/Map;", "(Lorg/apache/openjpa/kernel/StoreQuery;)Ljava/util/Map<Lorg/apache/openjpa/meta/FieldMetaData;Lorg/apache/openjpa/kernel/exps/Value;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getQueryExpressions", "()[Lorg/apache/openjpa/kernel/exps/QueryExpressions;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
