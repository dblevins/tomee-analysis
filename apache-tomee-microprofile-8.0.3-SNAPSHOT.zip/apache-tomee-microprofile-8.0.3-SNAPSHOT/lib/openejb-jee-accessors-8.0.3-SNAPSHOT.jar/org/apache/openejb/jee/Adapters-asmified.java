package asm.org.apache.openejb.jee;
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
public class AdaptersDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/jee/Adapters", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "collapsedStringAdapterAdapter", "Ljavax/xml/bind/annotation/adapters/CollapsedStringAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "stringAdapterAdapter", "Lorg/apache/openejb/jee/StringAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "handlerChainsStringQNameAdapterAdapter", "Lorg/apache/openejb/jee/HandlerChainsStringQNameAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "timeUnitAdapterAdapter", "Lorg/apache/openejb/jee/TimeUnitAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "booleanAdapterAdapter", "Lorg/apache/openejb/jee/BooleanAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "trimStringAdapterAdapter", "Lorg/apache/openejb/jee/TrimStringAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "loadOnStartupAdapterAdapter", "Lorg/apache/openejb/jee/LoadOnStartupAdapter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "javax/xml/bind/annotation/adapters/CollapsedStringAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/bind/annotation/adapters/CollapsedStringAdapter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/Adapters", "collapsedStringAdapterAdapter", "Ljavax/xml/bind/annotation/adapters/CollapsedStringAdapter;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/StringAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/StringAdapter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/Adapters", "stringAdapterAdapter", "Lorg/apache/openejb/jee/StringAdapter;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/HandlerChainsStringQNameAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/HandlerChainsStringQNameAdapter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/Adapters", "handlerChainsStringQNameAdapterAdapter", "Lorg/apache/openejb/jee/HandlerChainsStringQNameAdapter;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/TimeUnitAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/TimeUnitAdapter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/Adapters", "timeUnitAdapterAdapter", "Lorg/apache/openejb/jee/TimeUnitAdapter;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/BooleanAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/BooleanAdapter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/Adapters", "booleanAdapterAdapter", "Lorg/apache/openejb/jee/BooleanAdapter;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/TrimStringAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/TrimStringAdapter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/Adapters", "trimStringAdapterAdapter", "Lorg/apache/openejb/jee/TrimStringAdapter;");
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/LoadOnStartupAdapter");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/LoadOnStartupAdapter", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openejb/jee/Adapters", "loadOnStartupAdapterAdapter", "Lorg/apache/openejb/jee/LoadOnStartupAdapter;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
