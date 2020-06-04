package asm.org.apache.cxf.jaxrs.ext.search;
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
public class SearchContextDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/cxf/jaxrs/ext/search/SearchContext", null, "java/lang/Object", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCondition", "(Ljava/lang/Class;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCondition", "(Ljava/lang/Class;Ljava/util/Map;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCondition", "(Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition;", "<T:Ljava/lang/Object;>(Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCondition", "(Ljava/lang/String;Ljava/lang/Class;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCondition", "(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getCondition", "(Ljava/lang/String;Ljava/lang/Class;Ljava/util/Map;Ljava/util/Map;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition;", "<T:Ljava/lang/Object;>(Ljava/lang/String;Ljava/lang/Class<TT;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)Lorg/apache/cxf/jaxrs/ext/search/SearchCondition<TT;>;", null);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "getSearchExpression", "()Ljava/lang/String;", null, null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
