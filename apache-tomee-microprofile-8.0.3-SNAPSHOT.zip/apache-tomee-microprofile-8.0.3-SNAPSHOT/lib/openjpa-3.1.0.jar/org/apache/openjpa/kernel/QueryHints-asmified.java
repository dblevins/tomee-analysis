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
public class QueryHintsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/apache/openjpa/kernel/QueryHints", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_SUBCLASSES", "Ljava/lang/String;", null, "openjpa.Subclasses");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_FILTER_LISTENER", "Ljava/lang/String;", null, "openjpa.FilterListener");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_FILTER_LISTENERS", "Ljava/lang/String;", null, "openjpa.FilterListeners");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_AGGREGATE_LISTENER", "Ljava/lang/String;", null, "openjpa.AggregateListener");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_AGGREGATE_LISTENERS", "Ljava/lang/String;", null, "openjpa.AggregateListeners");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_RESULT_COUNT", "Ljava/lang/String;", null, "openjpa.hint.OptimizeResultCount");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_PARAM_MARKER_IN_QUERY", "Ljava/lang/String;", null, "openjpa.hint.ParameterMarkerInQuery");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_INVALIDATE_PREPARED_QUERY", "Ljava/lang/String;", null, "openjpa.hint.InvalidatePreparedQuery");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_IGNORE_PREPARED_QUERY", "Ljava/lang/String;", null, "openjpa.hint.IgnorePreparedQuery");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_IGNORE_FINDER", "Ljava/lang/String;", null, "openjpa.hint.IgnoreFinder");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_INVALIDATE_FINDER", "Ljava/lang/String;", null, "openjpa.hint.InvalidateFinder");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_RECACHE_FINDER", "Ljava/lang/String;", null, "openjpa.hint.RecacheFinder");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_RELAX_BIND_PARAM_TYPE_CHECK", "Ljava/lang/String;", null, "openjpa.hint.RelaxParameterTypeChecking");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HINT_USE_LITERAL_IN_SQL", "Ljava/lang/String;", null, "openjpa.hint.UseLiteralInSQL");
fieldVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
