package asm.org.yaml.snakeyaml.representer;
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
public class SafeRepresenter$RepresentMapDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentMap", null, "java/lang/Object", new String[] { "org/yaml/snakeyaml/representer/Represent" });

classWriter.visitInnerClass("org/yaml/snakeyaml/representer/SafeRepresenter$RepresentMap", "org/yaml/snakeyaml/representer/SafeRepresenter", "RepresentMap", ACC_PROTECTED);

classWriter.visitInnerClass("org/yaml/snakeyaml/DumperOptions$FlowStyle", "org/yaml/snakeyaml/DumperOptions", "FlowStyle", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/yaml/snakeyaml/representer/SafeRepresenter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "<init>", "(Lorg/yaml/snakeyaml/representer/SafeRepresenter;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentMap", "this$0", "Lorg/yaml/snakeyaml/representer/SafeRepresenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "representData", "(Ljava/lang/Object;)Lorg/yaml/snakeyaml/nodes/Node;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentMap", "this$0", "Lorg/yaml/snakeyaml/representer/SafeRepresenter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/yaml/snakeyaml/representer/SafeRepresenter$RepresentMap", "this$0", "Lorg/yaml/snakeyaml/representer/SafeRepresenter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/nodes/Tag", "MAP", "Lorg/yaml/snakeyaml/nodes/Tag;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/SafeRepresenter", "getTag", "(Ljava/lang/Class;Lorg/yaml/snakeyaml/nodes/Tag;)Lorg/yaml/snakeyaml/nodes/Tag;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitFieldInsn(GETSTATIC, "org/yaml/snakeyaml/DumperOptions$FlowStyle", "AUTO", "Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/yaml/snakeyaml/representer/SafeRepresenter", "representMapping", "(Lorg/yaml/snakeyaml/nodes/Tag;Ljava/util/Map;Lorg/yaml/snakeyaml/DumperOptions$FlowStyle;)Lorg/yaml/snakeyaml/nodes/Node;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
