package asm.org.eclipse.jdt.internal.compiler.lookup;
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
public class TypeConstantsDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_ABSTRACT | ACC_INTERFACE, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/lookup/TypeConstants$BoundCheckStatus", "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "BoundCheckStatus", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CloseMethodRecord", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/eclipse/jdt/internal/compiler/lookup/TypeConstants$DangerousMethod", "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DangerousMethod", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LANG", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IO", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NIO", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UTIL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ZIP", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANNOTATION", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REFLECT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LENGTH", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLONE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "EQUALS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GETCLASS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "HASHCODE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OBJECT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MAIN", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERIALVERSIONUID", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SERIALPERSISTENTFIELDS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "READRESOLVE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WRITEREPLACE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "READOBJECT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WRITEOBJECT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CharArray_JAVA_LANG_OBJECT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CharArray_JAVA_LANG_ENUM", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CharArray_JAVA_LANG_ANNOTATION_ANNOTATION", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CharArray_JAVA_IO_OBJECTINPUTSTREAM", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CharArray_JAVA_IO_OBJECTOUTPUTSTREAM", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CharArray_JAVA_IO_OBJECTSTREAMFIELD", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANONYM_PREFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANONYM_SUFFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_NAME", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_SUPER", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_EXTENDS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_MINUS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_STAR", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_PLUS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_CAPTURE_NAME_PREFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_CAPTURE_NAME_SUFFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_CAPTURE_SIGNABLE_NAME_SUFFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "WILDCARD_CAPTURE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CAPTURE18", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BYTE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SHORT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LONG", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLOAT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOUBLE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHAR", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BOOLEAN", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NULL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VOID", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUES", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALUEOF", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_SOURCE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_CLASS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_RUNTIME", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANNOTATION_PREFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANNOTATION_SUFFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_FIELD", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_METHOD", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_PARAMETER", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_CONSTRUCTOR", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_LOCAL_VARIABLE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_ANNOTATION_TYPE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_PACKAGE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ANONYMOUS_METHOD", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DESERIALIZE_LAMBDA", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAMBDA_TYPE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "UPPER_MODULE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VAR", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_USE_TARGET", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPE_PARAMETER_TARGET", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ECLIPSE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CORE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RUNTIME", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APACHE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMMONS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LANG3", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COM", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GOOGLE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JDT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INTERNAL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COMPILER", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LOOKUP", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "TYPEBINDING", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DOM", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ITYPEBINDING", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SPRING", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION_ANNOTATION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ASSERTIONERROR", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_CLASS", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_CLASSNOTFOUNDEXCEPTION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_NOSUCHFIELDERROR", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_CLONEABLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ENUM", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_EXCEPTION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ERROR", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ILLEGALARGUMENTEXCEPTION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ITERABLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_NOCLASSDEFERROR", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_OBJECT", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_STRING", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_STRINGBUFFER", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_STRINGBUILDER", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_SYSTEM", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_RUNTIMEEXCEPTION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_THROWABLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_REFLECT_CONSTRUCTOR", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_PRINTSTREAM", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_SERIALIZABLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_BYTE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_SHORT", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_CHARACTER", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_INTEGER", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_LONG", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_FLOAT", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_DOUBLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_BOOLEAN", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_VOID", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_UTIL_COLLECTION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_UTIL_ITERATOR", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_UTIL_OBJECTS", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_UTIL_LIST", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_DEPRECATED", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FOR_REMOVAL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SINCE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION_DOCUMENTED", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION_INHERITED", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION_REPEATABLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_OVERRIDE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_FUNCTIONAL_INTERFACE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION_RETENTION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_SUPPRESSWARNINGS", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION_TARGET", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION_RETENTIONPOLICY", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_ANNOTATION_ELEMENTTYPE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_REFLECT_FIELD", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_REFLECT_METHOD", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_CLOSEABLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_OBJECTSTREAMEXCEPTION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_EXTERNALIZABLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_IOEXCEPTION", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_OBJECTOUTPUTSTREAM", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_OBJECTINPUTSTREAM", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_NIO_FILE_FILES", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAX_RMI_CORBA_STUB", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_SAFEVARARGS", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INVOKE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_INVOKE_METHODHANDLE_POLYMORPHICSIGNATURE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_INVOKE_METHODHANDLE_$_POLYMORPHICSIGNATURE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_INVOKE_LAMBDAMETAFACTORY", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_INVOKE_SERIALIZEDLAMBDA", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_INVOKE_METHODHANDLES", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_LANG_AUTOCLOSEABLE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLOSE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GUAVA_CLOSEABLES", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APACHE_IOUTILS", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "APACHE_DBUTILS", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLOSE_QUIETLY", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "closeMethods", "[Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_WRAPPER_CLOSEABLES", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_UTIL_ZIP_WRAPPER_CLOSEABLES", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OTHER_WRAPPER_CLOSEABLES", "[[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_IO_RESOURCE_FREE_CLOSEABLES", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_UTIL_STREAM", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RESOURCE_FREE_CLOSEABLE_J_U_STREAMS", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHANNELS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FLUENT_RESOURCE_CLASSES", "[[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSERT_CLASS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG_ECLIPSE_CORE_RUNTIME_ASSERT", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_NOTNULL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JUNIT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FRAMEWORK", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JUPITER", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PARAMS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PROVIDER", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JUNIT_FRAMEWORK_ASSERT", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG_JUNIT_ASSERT", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSERT_NULL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSERT_NOTNULL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSERT_TRUE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ASSERT_FALSE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "METHOD_SOURCE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG_JUNIT_METHOD_SOURCE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "VALIDATE_CLASS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG_APACHE_COMMONS_LANG_VALIDATE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG_APACHE_COMMONS_LANG3_VALIDATE", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG_ECLIPSE_JDT_INTERNAL_COMPILER_LOOKUP_TYPEBINDING", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG_ECLIPSE_JDT_CORE_DOM_ITYPEBINDING", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "IS_TRUE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "NOT_NULL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COM_GOOGLE_COMMON_BASE_PRECONDITIONS", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHECK_NOT_NULL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHECK_ARGUMENT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CHECK_STATE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRE_NON_NULL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INJECT_PACKAGE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INJECT_TYPE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVAX_ANNOTATION_INJECT_INJECT", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "COM_GOOGLE_INJECT_INJECT", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "OPTIONAL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_UTIL_MAP", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "GET", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REMOVE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REMOVE_ALL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTAINS_ALL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "RETAIN_ALL", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTAINS_KEY", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTAINS_VALUE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONTAINS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INDEX_OF", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LAST_INDEX_OF", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTOWIRED", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "BEANS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "FACTORY", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "ORG_SPRING_AUTOWIRED", "[[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "REQUIRED", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINT_EQUAL", "I", null, new Integer(0));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINT_EXTENDS", "I", null, new Integer(1));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CONSTRAINT_SUPER", "I", null, new Integer(2));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INIT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CLINIT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_SWITCH_ENUM_TABLE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_ENUM_VALUES", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_ASSERT_DISABLED", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_CLASS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_OUTER_LOCAL_PREFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_ENCLOSING_INSTANCE_PREFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_ACCESS_METHOD_PREFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_ENUM_CONSTANT_INITIALIZATION_METHOD_PREFIX", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "SYNTHETIC_STATIC_FACTORY", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_LOCATION__PARAMETER", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_LOCATION__RETURN_TYPE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_LOCATION__FIELD", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_LOCATION__TYPE_ARGUMENT", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_LOCATION__TYPE_PARAMETER", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_LOCATION__TYPE_BOUND", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "DEFAULT_LOCATION__ARRAY_CONTENTS", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "PACKAGE_INFO_NAME", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE_INFO_NAME", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE_INFO_NAME_STRING", "Ljava/lang/String;", null, "module-info");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE_INFO_FILE_NAME", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE_INFO_CLASS_NAME", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE_INFO_FILE_NAME_STRING", "Ljava/lang/String;", null, "module-info.java");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MODULE_INFO_CLASS_NAME_STRING", "Ljava/lang/String;", null, "module-info.class");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "JAVA_BASE", "[C", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "META_INF_MANIFEST_MF", "Ljava/lang/String;", null, "META-INF/MANIFEST.MF");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "AUTOMATIC_MODULE_NAME", "Ljava/lang/String;", null, "Automatic-Module-Name");
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("java");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitLdcInsn("javax");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVAX", "[C");
methodVisitor.visitLdcInsn("lang");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitLdcInsn("io");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitLdcInsn("nio");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitLdcInsn("util");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitLdcInsn("zip");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ZIP", "[C");
methodVisitor.visitLdcInsn("annotation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitLdcInsn("reflect");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REFLECT", "[C");
methodVisitor.visitLdcInsn("length");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LENGTH", "[C");
methodVisitor.visitLdcInsn("clone");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLONE", "[C");
methodVisitor.visitLdcInsn("equals");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "EQUALS", "[C");
methodVisitor.visitLdcInsn("getClass");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GETCLASS", "[C");
methodVisitor.visitLdcInsn("hashCode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "HASHCODE", "[C");
methodVisitor.visitLdcInsn("Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "OBJECT", "[C");
methodVisitor.visitLdcInsn("main");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "MAIN", "[C");
methodVisitor.visitLdcInsn("serialVersionUID");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SERIALVERSIONUID", "[C");
methodVisitor.visitLdcInsn("serialPersistentFields");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SERIALPERSISTENTFIELDS", "[C");
methodVisitor.visitLdcInsn("readResolve");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "READRESOLVE", "[C");
methodVisitor.visitLdcInsn("writeReplace");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WRITEREPLACE", "[C");
methodVisitor.visitLdcInsn("readObject");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "READOBJECT", "[C");
methodVisitor.visitLdcInsn("writeObject");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WRITEOBJECT", "[C");
methodVisitor.visitLdcInsn("java.lang.Object");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CharArray_JAVA_LANG_OBJECT", "[C");
methodVisitor.visitLdcInsn("java.lang.Enum");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CharArray_JAVA_LANG_ENUM", "[C");
methodVisitor.visitLdcInsn("java.lang.annotation.Annotation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CharArray_JAVA_LANG_ANNOTATION_ANNOTATION", "[C");
methodVisitor.visitLdcInsn("java.io.ObjectInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CharArray_JAVA_IO_OBJECTINPUTSTREAM", "[C");
methodVisitor.visitLdcInsn("java.io.ObjectOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CharArray_JAVA_IO_OBJECTOUTPUTSTREAM", "[C");
methodVisitor.visitLdcInsn("java.io.ObjectStreamField");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CharArray_JAVA_IO_OBJECTSTREAMFIELD", "[C");
methodVisitor.visitLdcInsn("new ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANONYM_PREFIX", "[C");
methodVisitor.visitLdcInsn("(){}");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANONYM_SUFFIX", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 63);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_NAME", "[C");
methodVisitor.visitLdcInsn(" super ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_SUPER", "[C");
methodVisitor.visitLdcInsn(" extends ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_EXTENDS", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 45);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_MINUS", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 42);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_STAR", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 43);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_PLUS", "[C");
methodVisitor.visitLdcInsn("capture#");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_CAPTURE_NAME_PREFIX", "[C");
methodVisitor.visitLdcInsn("-of ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_CAPTURE_NAME_SUFFIX", "[C");
methodVisitor.visitLdcInsn("capture-of ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_CAPTURE_SIGNABLE_NAME_SUFFIX", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "WILDCARD_CAPTURE", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(NEWARRAY, T_CHAR);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitIntInsn(BIPUSH, 94);
methodVisitor.visitInsn(CASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CAPTURE18", "[C");
methodVisitor.visitLdcInsn("byte");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "BYTE", "[C");
methodVisitor.visitLdcInsn("short");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SHORT", "[C");
methodVisitor.visitLdcInsn("int");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INT", "[C");
methodVisitor.visitLdcInsn("long");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LONG", "[C");
methodVisitor.visitLdcInsn("float");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "FLOAT", "[C");
methodVisitor.visitLdcInsn("double");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DOUBLE", "[C");
methodVisitor.visitLdcInsn("char");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHAR", "[C");
methodVisitor.visitLdcInsn("boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "BOOLEAN", "[C");
methodVisitor.visitLdcInsn("null");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NULL", "[C");
methodVisitor.visitLdcInsn("void");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "VOID", "[C");
methodVisitor.visitLdcInsn("value");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "VALUE", "[C");
methodVisitor.visitLdcInsn("values");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "VALUES", "[C");
methodVisitor.visitLdcInsn("valueOf");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "VALUEOF", "[C");
methodVisitor.visitLdcInsn("SOURCE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_SOURCE", "[C");
methodVisitor.visitLdcInsn("CLASS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_CLASS", "[C");
methodVisitor.visitLdcInsn("RUNTIME");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_RUNTIME", "[C");
methodVisitor.visitLdcInsn("@");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION_PREFIX", "[C");
methodVisitor.visitLdcInsn("()");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION_SUFFIX", "[C");
methodVisitor.visitLdcInsn("TYPE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "TYPE", "[C");
methodVisitor.visitLdcInsn("FIELD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_FIELD", "[C");
methodVisitor.visitLdcInsn("METHOD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_METHOD", "[C");
methodVisitor.visitLdcInsn("PARAMETER");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_PARAMETER", "[C");
methodVisitor.visitLdcInsn("CONSTRUCTOR");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_CONSTRUCTOR", "[C");
methodVisitor.visitLdcInsn("LOCAL_VARIABLE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_LOCAL_VARIABLE", "[C");
methodVisitor.visitLdcInsn("ANNOTATION_TYPE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_ANNOTATION_TYPE", "[C");
methodVisitor.visitLdcInsn("PACKAGE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_PACKAGE", "[C");
methodVisitor.visitLdcInsn("lambda$");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANONYMOUS_METHOD", "[C");
methodVisitor.visitLdcInsn("$deserializeLambda$");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DESERIALIZE_LAMBDA", "[C");
methodVisitor.visitLdcInsn("<lambda>");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LAMBDA_TYPE", "[C");
methodVisitor.visitLdcInsn("MODULE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UPPER_MODULE", "[C");
methodVisitor.visitLdcInsn("var");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "VAR", "[C");
methodVisitor.visitLdcInsn("TYPE_USE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "TYPE_USE_TARGET", "[C");
methodVisitor.visitLdcInsn("TYPE_PARAMETER");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "TYPE_PARAMETER_TARGET", "[C");
methodVisitor.visitLdcInsn("org");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitLdcInsn("eclipse");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ECLIPSE", "[C");
methodVisitor.visitLdcInsn("core");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CORE", "[C");
methodVisitor.visitLdcInsn("runtime");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "RUNTIME", "[C");
methodVisitor.visitLdcInsn("apache");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE", "[C");
methodVisitor.visitLdcInsn("commons");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COMMONS", "[C");
methodVisitor.visitLdcInsn("lang3");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG3", "[C");
methodVisitor.visitLdcInsn("com");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COM", "[C");
methodVisitor.visitLdcInsn("google");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GOOGLE", "[C");
methodVisitor.visitLdcInsn("jdt");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JDT", "[C");
methodVisitor.visitLdcInsn("internal");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INTERNAL", "[C");
methodVisitor.visitLdcInsn("compiler");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COMPILER", "[C");
methodVisitor.visitLdcInsn("lookup");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LOOKUP", "[C");
methodVisitor.visitLdcInsn("TypeBinding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "TYPEBINDING", "[C");
methodVisitor.visitLdcInsn("dom");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DOM", "[C");
methodVisitor.visitLdcInsn("ITypeBinding");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ITYPEBINDING", "[C");
methodVisitor.visitLdcInsn("springframework");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SPRING", "[C");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG", "[[C");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Annotation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION_ANNOTATION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("AssertionError");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ASSERTIONERROR", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_CLASS", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ClassNotFoundException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_CLASSNOTFOUNDEXCEPTION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("NoSuchFieldError");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_NOSUCHFIELDERROR", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Cloneable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_CLONEABLE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Enum");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ENUM", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Exception");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_EXCEPTION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Error");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ERROR", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("IllegalArgumentException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ILLEGALARGUMENTEXCEPTION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Iterable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ITERABLE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("NoClassDefError");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_NOCLASSDEFERROR", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "OBJECT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_OBJECT", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("String");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_STRING", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("StringBuffer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_STRINGBUFFER", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("StringBuilder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_STRINGBUILDER", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("System");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_SYSTEM", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("RuntimeException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_RUNTIMEEXCEPTION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Throwable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_THROWABLE", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REFLECT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Constructor");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_REFLECT_CONSTRUCTOR", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("PrintStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_PRINTSTREAM", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Serializable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_SERIALIZABLE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Byte");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_BYTE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Short");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_SHORT", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Character");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_CHARACTER", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Integer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_INTEGER", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Long");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_LONG", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Float");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_FLOAT", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Double");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_DOUBLE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_BOOLEAN", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Void");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_VOID", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Collection");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_UTIL_COLLECTION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Iterator");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_UTIL_ITERATOR", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Objects");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_UTIL_OBJECTS", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("List");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_UTIL_LIST", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Deprecated");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_DEPRECATED", "[[C");
methodVisitor.visitLdcInsn("forRemoval");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "FOR_REMOVAL", "[C");
methodVisitor.visitLdcInsn("since");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SINCE", "[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Documented");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION_DOCUMENTED", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Inherited");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION_INHERITED", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Repeatable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION_REPEATABLE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Override");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_OVERRIDE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("FunctionalInterface");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_FUNCTIONAL_INTERFACE", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Retention");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION_RETENTION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("SuppressWarnings");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_SUPPRESSWARNINGS", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Target");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION_TARGET", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("RetentionPolicy");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION_RETENTIONPOLICY", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("ElementType");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_ANNOTATION_ELEMENTTYPE", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REFLECT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Field");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_REFLECT_FIELD", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REFLECT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Method");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_REFLECT_METHOD", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Closeable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_CLOSEABLE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ObjectStreamException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_OBJECTSTREAMEXCEPTION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Externalizable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_EXTERNALIZABLE", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("IOException");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_IOEXCEPTION", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ObjectOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_OBJECTOUTPUTSTREAM", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ObjectInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_OBJECTINPUTSTREAM", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("nio");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("file");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Files");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_NIO_FILE_FILES", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVAX", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("rmi");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("CORBA");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Stub");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVAX_RMI_CORBA_STUB", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("SafeVarargs");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_SAFEVARARGS", "[[C");
methodVisitor.visitLdcInsn("invoke");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INVOKE", "[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INVOKE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("MethodHandle");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("PolymorphicSignature");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_INVOKE_METHODHANDLE_POLYMORPHICSIGNATURE", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INVOKE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("MethodHandle$PolymorphicSignature");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_INVOKE_METHODHANDLE_$_POLYMORPHICSIGNATURE", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INVOKE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("LambdaMetafactory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_INVOKE_LAMBDAMETAFACTORY", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INVOKE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("SerializedLambda");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_INVOKE_SERIALIZEDLAMBDA", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INVOKE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("MethodHandles");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_INVOKE_METHODHANDLES", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("AutoCloseable");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_LANG_AUTOCLOSEABLE", "[[C");
methodVisitor.visitLdcInsn("close");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLOSE", "[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COM", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GOOGLE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("common");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("Closeables");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GUAVA_CLOSEABLES", "[[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COMMONS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("IOUtils");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_IOUTILS", "[[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COMMONS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("dbutils");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("DbUtils");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_DBUTILS", "[[C");
methodVisitor.visitLdcInsn("closeQuietly");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLOSE_QUIETLY", "[C");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GUAVA_CLOSEABLES", "[[C");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLOSE_QUIETLY", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GUAVA_CLOSEABLES", "[[C");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLOSE", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_IOUTILS", "[[C");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLOSE_QUIETLY", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_DBUTILS", "[[C");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLOSE", "[C");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_DBUTILS", "[[C");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLOSE_QUIETLY", "[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_DBUTILS", "[[C");
methodVisitor.visitLdcInsn("commitAndClose");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_DBUTILS", "[[C");
methodVisitor.visitLdcInsn("commitAndCloseQuietly");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_DBUTILS", "[[C");
methodVisitor.visitLdcInsn("rollbackAndClose");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE_DBUTILS", "[[C");
methodVisitor.visitLdcInsn("rollbackAndCloseQuietly");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord", "<init>", "([[C[CI)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "closeMethods", "[Lorg/eclipse/jdt/internal/compiler/lookup/TypeConstants$CloseMethodRecord;");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("BufferedInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("BufferedOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("BufferedReader");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("BufferedWriter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("InputStreamReader");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("PrintWriter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("LineNumberReader");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("DataInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("DataOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("ObjectInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("ObjectOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("FilterInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitLdcInsn("FilterOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitLdcInsn("DataInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitLdcInsn("DataOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitLdcInsn("PushbackInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitLdcInsn("SequenceInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 17);
methodVisitor.visitLdcInsn("PrintStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 18);
methodVisitor.visitLdcInsn("PushbackReader");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 19);
methodVisitor.visitLdcInsn("OutputStreamWriter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_WRAPPER_CLOSEABLES", "[[C");
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("GZIPInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("InflaterInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("DeflaterInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("CheckedInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("ZipInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("JarInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("GZIPOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn("InflaterOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("DeflaterOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitLdcInsn("CheckedOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitLdcInsn("ZipOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitLdcInsn("JarOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_UTIL_ZIP_WRAPPER_CLOSEABLES", "[[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("security");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("DigestInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("security");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("DigestOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("beans");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("XMLEncoder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("beans");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("XMLDecoder");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVAX", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("sound");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("sampled");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("AudioInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "OTHER_WRAPPER_CLOSEABLES", "[[[C");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("StringReader");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("StringWriter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("ByteArrayInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("ByteArrayOutputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("CharArrayReader");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("CharArrayWriter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("StringBufferInputStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_IO_RESOURCE_FREE_CLOSEABLES", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("stream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_UTIL_STREAM", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("Stream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("DoubleStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("LongStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("IntStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "RESOURCE_FREE_CLOSEABLE_J_U_STREAMS", "[[C");
methodVisitor.visitLdcInsn("channels");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitIntInsn(BIPUSH, 16);
methodVisitor.visitTypeInsn(ANEWARRAY, "[[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("CharArrayWriter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Console");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("PrintStream");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("PrintWriter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("StringWriter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Writer");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("AsynchronousFileChannel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("AsynchronousServerSocketChannel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("FileChannel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("NetworkChannel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("SeekableByteChannel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("SelectableChannel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 12);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("Selector");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 13);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NIO", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHANNELS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("ServerSocketChannel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 14);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Formatter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 15);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Scanner");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "FLUENT_RESOURCE_CLASSES", "[[[C");
methodVisitor.visitLdcInsn("Assert");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ASSERT_CLASS", "[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ECLIPSE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CORE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "RUNTIME", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ASSERT_CLASS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG_ECLIPSE_CORE_RUNTIME_ASSERT", "[[C");
methodVisitor.visitLdcInsn("isNotNull");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IS_NOTNULL", "[C");
methodVisitor.visitLdcInsn("junit");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JUNIT", "[C");
methodVisitor.visitLdcInsn("framework");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "FRAMEWORK", "[C");
methodVisitor.visitLdcInsn("jupiter");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JUPITER", "[C");
methodVisitor.visitLdcInsn("params");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "PARAMS", "[C");
methodVisitor.visitLdcInsn("provider");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "PROVIDER", "[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JUNIT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "FRAMEWORK", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ASSERT_CLASS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JUNIT_FRAMEWORK_ASSERT", "[[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JUNIT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ASSERT_CLASS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG_JUNIT_ASSERT", "[[C");
methodVisitor.visitLdcInsn("assertNull");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ASSERT_NULL", "[C");
methodVisitor.visitLdcInsn("assertNotNull");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ASSERT_NOTNULL", "[C");
methodVisitor.visitLdcInsn("assertTrue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ASSERT_TRUE", "[C");
methodVisitor.visitLdcInsn("assertFalse");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ASSERT_FALSE", "[C");
methodVisitor.visitLdcInsn("MethodSource");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "METHOD_SOURCE", "[C");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JUNIT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JUPITER", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "PARAMS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "PROVIDER", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "METHOD_SOURCE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG_JUNIT_METHOD_SOURCE", "[[C");
methodVisitor.visitLdcInsn("Validate");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "VALIDATE_CLASS", "[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COMMONS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "VALIDATE_CLASS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG_APACHE_COMMONS_LANG_VALIDATE", "[[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "APACHE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COMMONS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LANG3", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "VALIDATE_CLASS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG_APACHE_COMMONS_LANG3_VALIDATE", "[[C");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ECLIPSE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JDT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INTERNAL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COMPILER", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LOOKUP", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "TYPEBINDING", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG_ECLIPSE_JDT_INTERNAL_COMPILER_LOOKUP_TYPEBINDING", "[[C");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ECLIPSE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JDT", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CORE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DOM", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ITYPEBINDING", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG_ECLIPSE_JDT_CORE_DOM_ITYPEBINDING", "[[C");
methodVisitor.visitLdcInsn("isTrue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "IS_TRUE", "[C");
methodVisitor.visitLdcInsn("notNull");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "NOT_NULL", "[C");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COM", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GOOGLE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("common");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("base");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("Preconditions");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COM_GOOGLE_COMMON_BASE_PRECONDITIONS", "[[C");
methodVisitor.visitLdcInsn("checkNotNull");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHECK_NOT_NULL", "[C");
methodVisitor.visitLdcInsn("checkArgument");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHECK_ARGUMENT", "[C");
methodVisitor.visitLdcInsn("checkState");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CHECK_STATE", "[C");
methodVisitor.visitLdcInsn("requireNonNull");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REQUIRE_NON_NULL", "[C");
methodVisitor.visitLdcInsn("inject");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INJECT_PACKAGE", "[C");
methodVisitor.visitLdcInsn("Inject");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INJECT_TYPE", "[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVAX", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INJECT_PACKAGE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INJECT_TYPE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVAX_ANNOTATION_INJECT_INJECT", "[[C");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COM", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GOOGLE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INJECT_PACKAGE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INJECT_TYPE", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "COM_GOOGLE_INJECT_INJECT", "[[C");
methodVisitor.visitLdcInsn("optional");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "OPTIONAL", "[C");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "UTIL", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Map");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_UTIL_MAP", "[[C");
methodVisitor.visitLdcInsn("get");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "GET", "[C");
methodVisitor.visitLdcInsn("remove");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REMOVE", "[C");
methodVisitor.visitLdcInsn("removeAll");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REMOVE_ALL", "[C");
methodVisitor.visitLdcInsn("containsAll");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS_ALL", "[C");
methodVisitor.visitLdcInsn("retainAll");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "RETAIN_ALL", "[C");
methodVisitor.visitLdcInsn("containsKey");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS_KEY", "[C");
methodVisitor.visitLdcInsn("containsValue");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS_VALUE", "[C");
methodVisitor.visitLdcInsn("contains");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CONTAINS", "[C");
methodVisitor.visitLdcInsn("indexOf");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INDEX_OF", "[C");
methodVisitor.visitLdcInsn("lastIndexOf");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "LAST_INDEX_OF", "[C");
methodVisitor.visitLdcInsn("Autowired");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "AUTOWIRED", "[C");
methodVisitor.visitLdcInsn("beans");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "BEANS", "[C");
methodVisitor.visitLdcInsn("factory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "FACTORY", "[C");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "[C");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SPRING", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "BEANS", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "FACTORY", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ANNOTATION", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "AUTOWIRED", "[C");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "ORG_SPRING_AUTOWIRED", "[[C");
methodVisitor.visitLdcInsn("required");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "REQUIRED", "[C");
methodVisitor.visitLdcInsn("<init>");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "INIT", "[C");
methodVisitor.visitLdcInsn("<clinit>");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "CLINIT", "[C");
methodVisitor.visitLdcInsn("$SWITCH_TABLE$");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_SWITCH_ENUM_TABLE", "[C");
methodVisitor.visitLdcInsn("ENUM$VALUES");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_ENUM_VALUES", "[C");
methodVisitor.visitLdcInsn("$assertionsDisabled");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_ASSERT_DISABLED", "[C");
methodVisitor.visitLdcInsn("class$");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_CLASS", "[C");
methodVisitor.visitLdcInsn("val$");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_OUTER_LOCAL_PREFIX", "[C");
methodVisitor.visitLdcInsn("this$");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_ENCLOSING_INSTANCE_PREFIX", "[C");
methodVisitor.visitLdcInsn("access$");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_ACCESS_METHOD_PREFIX", "[C");
methodVisitor.visitLdcInsn(" enum constant initialization$");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_ENUM_CONSTANT_INITIALIZATION_METHOD_PREFIX", "[C");
methodVisitor.visitLdcInsn("<factory>");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "SYNTHETIC_STATIC_FACTORY", "[C");
methodVisitor.visitLdcInsn("PARAMETER");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DEFAULT_LOCATION__PARAMETER", "[C");
methodVisitor.visitLdcInsn("RETURN_TYPE");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DEFAULT_LOCATION__RETURN_TYPE", "[C");
methodVisitor.visitLdcInsn("FIELD");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DEFAULT_LOCATION__FIELD", "[C");
methodVisitor.visitLdcInsn("TYPE_ARGUMENT");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DEFAULT_LOCATION__TYPE_ARGUMENT", "[C");
methodVisitor.visitLdcInsn("TYPE_PARAMETER");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DEFAULT_LOCATION__TYPE_PARAMETER", "[C");
methodVisitor.visitLdcInsn("TYPE_BOUND");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DEFAULT_LOCATION__TYPE_BOUND", "[C");
methodVisitor.visitLdcInsn("ARRAY_CONTENTS");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "DEFAULT_LOCATION__ARRAY_CONTENTS", "[C");
methodVisitor.visitLdcInsn("package-info");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "PACKAGE_INFO_NAME", "[C");
methodVisitor.visitLdcInsn("module-info");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "MODULE_INFO_NAME", "[C");
methodVisitor.visitLdcInsn("module-info.java");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "MODULE_INFO_FILE_NAME", "[C");
methodVisitor.visitLdcInsn("module-info.class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "MODULE_INFO_CLASS_NAME", "[C");
methodVisitor.visitLdcInsn("java.base");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/jdt/internal/compiler/lookup/TypeConstants", "JAVA_BASE", "[C");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
